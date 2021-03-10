package com.jiangnanyidianyu.controller;

import com.jiangnanyidianyu.bean.BaseMessage;
import com.jiangnanyidianyu.bean.Location;
import com.jiangnanyidianyu.bean.MsgEg;
import com.jiangnanyidianyu.utils.ImageMessageUtil;
import com.jiangnanyidianyu.utils.MessageUtil;
import com.jiangnanyidianyu.utils.TextMessageUtil;
import com.sun.deploy.xml.XMLable;
import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName handler
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/22 17:14
 */
@RestController
public class handler {

    /**
    *
     * @Author Qinnn
     * @Description //TODO 连接后的默认Post方法,接受用户输入的消息
     * @Date 14:35 2020/9/23
     * @Param
     * @return
     **/
//    @PostMapping("/verify_wx_token")
//    public void handler(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        PrintWriter out = response.getWriter();
//
//        Map<String, String> parseXml = MessageUtil.parseXml(request);
//
//        String msgType = parseXml.get("MsgType");
//        String content = parseXml.get("Content");
//        String fromusername = parseXml.get("FromUserName");
//        String tousername = parseXml.get("ToUserName");
//        System.out.println(msgType);
//        System.out.println(content);
//        System.out.println(fromusername);
//        System.out.println(tousername);
//    }
    
    /**
    *
     * @Author Qinnn
     * @Description //TODO 根据用户传入的文本消息返回文本消息
     * @Date 14:35 2020/9/23
     * @Param 
     * @return 
     **/
//    @PostMapping("/verify_wx_token")
//    public void TxtMessage(HttpServletRequest request,HttpServletResponse response){
//        response.setCharacterEncoding("utf-8");
//        PrintWriter out = null;
//        //将微信请求xml转为map格式，获取所需的参数
//        Map<String,String> map = MessageUtil.xmlToMap(request);
//        String ToUserName = map.get("ToUserName");
//        String FromUserName = map.get("FromUserName");
//        String MsgType = map.get("MsgType");
//        String Content = map.get("Content");
//
//        String message = null;
//        TextMessageUtil textMessage = new TextMessageUtil();
//        //处理文本类型，实现输入1，回复相应的封装的内容
//        if("text".equals(MsgType) && "1".equals(Content)){
//                message = textMessage.initMessage(FromUserName, ToUserName,MsgEg.INITIALMSG);
//        }
//        else
//            message = textMessage.initMessage(FromUserName, ToUserName,MsgEg.OTHERMSG);
//        try {
//            out = response.getWriter();
//            out.write(message);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        out.close();
//    }

    /**
    **
     * @Author Qinnn
     * @Description //TODO 根据用户输入的内容返回文本或者图片
     * @Date 13:52 2020/9/24
     * @Param [request, response]
     * @return void
     **/
    @PostMapping(value = "/verify_wx_token")
    public void dopost(HttpServletRequest request,HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;
        //将微信请求xml转为map格式，获取所需的参数
        Map<String,String> map = MessageUtil.xmlToMap(request);
        String ToUserName = map.get("ToUserName");
        String FromUserName = map.get("FromUserName");
        String MsgType = map.get("MsgType");
        String Content = map.get("Content");

        String message = null;
        //处理文本类型，实现输入1，回复相应的封装的内容
        if("text".equals(MsgType)){
            if("图片".equals(Content)){
                ImageMessageUtil util = new ImageMessageUtil();
                message = util.initMessage(FromUserName, ToUserName);
            }else{
                TextMessageUtil textMessage = new TextMessageUtil();
                message = textMessage.initMessage(FromUserName, ToUserName,Content);
            }
        }
        else if ("location".equals(MsgType))
        {
            String Location_X = map.get("Location_X");
            String Location_Y = map.get("Location_Y");
            String Label = map.get("Label");
            Long CreateTime = Long.parseLong(map.get("CreateTime"));

            Location location = new Location(Location_X,Location_Y,Label,CreateTime);

            TextMessageUtil textMessage = new TextMessageUtil();
            message = textMessage.initMessage(FromUserName, ToUserName,location.toString());
        }
        try {
            out = response.getWriter();
            out.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }
}
