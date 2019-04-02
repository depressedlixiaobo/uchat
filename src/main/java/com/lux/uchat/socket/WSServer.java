package com.lux.uchat.socket;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WSServer {

    private  static class SingleTonWSServer {
        static final WSServer instance = new WSServer();
    }
    public static WSServer getInstance(){
        return   SingleTonWSServer.instance;
    }

    private EventLoopGroup boss;
    private EventLoopGroup worker;
    private ServerBootstrap serverBootstrap;
    ChannelFuture future;

    public WSServer(){
             boss = new NioEventLoopGroup();
        worker = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(boss,worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new WSInitializer());


    }
    public void start(int port){
        this.future =  serverBootstrap.bind(port);
    }

}
