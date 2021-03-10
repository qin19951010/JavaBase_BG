package com.qinnn.springbootwebsocket.Config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName WebSocket
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/12/30 15:52
 */
@Slf4j
@Component
@ServerEndpoint(value = "/connectWebSocket/{userId}")
public class WebSocket {

    /**
     *  静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
     */
    public static int onlineNumber = 0;
    /**
     *  concurrent包的线程安全Map，用来存放每个客户端对应的MyWebSocket对象。
     */
    private static Map<String, WebSocket> clients = new ConcurrentHashMap<String, WebSocket>();
    /**
     * 会话
     */
    private Session session;
    /**
     * 用户名称
     */
    private String userId;

    /**
     * 建立连接
     *
     * @param session
     */
    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session)
    {
        onlineNumber++;
        log.info("现在来连接的客户id：{}用户名：{}",session.getId(),userId);
        this.userId = userId;
        this.session = session;

        try {
            //messageType 1代表上线 2代表下线 3代表在线名单 4代表普通消息
            //先给所有人发送通知，说我上线了
            Map<String,Object> map1 = new HashMap<String,Object>();
            map1.put("messageType",1);
            map1.put("userId",userId);
            sendMessageAll(JSON.toJSONString(map1),userId);

            //把自己的信息加入到map当中去
            clients.put(userId, this);
            log.info("有连接关闭！ 当前在线人数" + clients.size());

            //给自己发一条消息：告诉自己现在都有谁在线
            Map<String,Object> map2 = new HashMap<String,Object>();
            map2.put("messageType",3);

            //移除掉自己
            Set<String> set = clients.keySet();
            map2.put("onlineUsers",set);
            sendMessageTo(JSON.toJSONString(map2),userId);
        }
        catch (IOException e){
            log.info(userId+"上线的时候通知所有人发生了错误");
        }
    }
    /**
     * 错误消息
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.info("服务端发生了错误"+error.getMessage());
    }

    /**
     * 连接关闭
     */
    @OnClose
    public void onClose()
    {
        onlineNumber--;
        clients.remove(userId);
        try {
            //messageType 1代表上线 2代表下线 3代表在线名单  4代表普通消息
            Map<String,Object> map1 = new HashMap<String,Object>();
            map1.put("messageType",2);
            map1.put("onlineUsers",clients.keySet());
            map1.put("userId",userId);
            sendMessageAll(JSON.toJSONString(map1),userId);
        }
        catch (IOException e){
            log.info(userId+"下线的时候通知所有人发生了错误");
        }
        log.info("有连接关闭！ 当前在线人数" + clients.size());
    }
    /**
     * 收到客户端的消息
     * @param message 消息
     * @param session 会话
     */
    @OnMessage
    public void onMessage(String message, Session session)
    {
        try {
            log.info("来自客户端消息：" + message+"客户端的id是："+session.getId());

            System.out.println("------------  :"+message);

            JSONObject jsonObject = JSON.parseObject(message);
            String textMessage = jsonObject.getString("message");
            String fromuserId = jsonObject.getString("userId");
            String touserId = jsonObject.getString("to");
            //如果不是发给所有，那么就发给某一个人

            //messageType 1代表上线 2代表下线 3代表在线名单  4代表普通消息
            Map<String,Object> map1 = new HashMap<String,Object>();
            map1.put("messageType",4);
            map1.put("textMessage",textMessage);
            map1.put("fromuserId",fromuserId);

            if(touserId.equals("All")){
                map1.put("touserId","所有人");
                sendMessageAll(JSON.toJSONString(map1),fromuserId);
            }
            else{
                map1.put("touserId",touserId);
                System.out.println("开始推送消息给"+touserId);
                sendMessageTo(JSON.toJSONString(map1),touserId);
            }
        }
        catch (Exception e){

            e.printStackTrace();
            log.info("发生了错误了");
        }
    }
    /**
     * 收到客户端的消息
     * @param message 消息
     * @param TouserId 消息接收者id
     */
    public void sendMessageTo(String message, String TouserId) throws IOException {
        for (WebSocket item : clients.values()) {
            if (item.userId.equals(TouserId) ) {
                item.session.getAsyncRemote().sendText(message);
                break;
            }
        }
    }
    /**
     * 收到客户端的消息
     * @param message 消息
     * @param FromuserId 消息发送者id
     */
    public void sendMessageAll(String message,String FromuserId) throws IOException {
        for (WebSocket item : clients.values()) {
            item.session.getAsyncRemote().sendText(message);
        }
    }
    /**
     * 在线人数
     */
    public static synchronized int getOnlineCount() {
        return onlineNumber;
    }
}
