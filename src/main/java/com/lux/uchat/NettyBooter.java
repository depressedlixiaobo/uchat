package com.lux.uchat;

import com.lux.uchat.socket.WSServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class NettyBooter implements ApplicationListener<ContextRefreshedEvent> {
    @Value("${custom.netty.port}")
    private Integer  port ;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if(contextRefreshedEvent.getApplicationContext().getParent() == null){//为什么判断为空 可以启动netty
            System.out.println("netty 服务正在启动");
           try {
               WSServer.getInstance().start(port);
           }
           catch (Exception ex){
               System.out.println(ex);
           }
            System.out.println("netty 服务启动完成");
        }
    }
}
