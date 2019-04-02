package com.lux.uchat.socket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    private static ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame msg) throws Exception {

        String content = msg.text();
        System.out.println("接收到数据"+content);

        clients.writeAndFlush(new TextWebSocketFrame("接收到参数："+content));

    }

    /*
     当客户端链接服务器后 获取客户端的channel 放入全局channel里 共同维护
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client add"+ctx.channel().id().asLongText());
        clients.add( ctx.channel());
    }

    /*
    当用户移除后 会自动删除 channel里面的对象
     */
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client breank" + ctx.channel().id().asShortText());
    }
}
