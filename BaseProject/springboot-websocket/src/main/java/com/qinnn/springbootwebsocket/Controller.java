package com.qinnn.springbootwebsocket;

import com.qinnn.springbootwebsocket.Config.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @ClassName Controller
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/12/30 16:10
 */
@RestController
public class Controller {

    @Autowired
    WebSocket webSocket;

    @GetMapping("/sendTo")
    public String sendTo(@RequestParam("userId") String userId, @RequestParam("msg") String msg) throws IOException, IOException {

        webSocket.sendMessageTo(msg,userId);

        return "推送成功";
    }

    @GetMapping("/sendAll")
    public String sendAll(@RequestParam("msg") String msg) throws IOException {

        String fromUserId="system";//其实没用上
        webSocket.sendMessageAll(msg,fromUserId);

        return "推送成功";
    }
}
