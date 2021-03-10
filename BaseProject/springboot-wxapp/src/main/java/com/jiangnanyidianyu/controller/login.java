package com.jiangnanyidianyu.controller;

import com.jiangnanyidianyu.utils.CheckUtil;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @ClassName login
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/22 16:34
 */

@Slf4j
@RestController
public class login {

    @GetMapping("/verify_wx_token")
    public void login(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {

        request.setCharacterEncoding("UTF-8");
        //微信加密签名
        String signature = request.getParameter("signature");
        //时间戳
        String timestamp = request.getParameter("timestamp");
        //随机数
        String nonce = request.getParameter("nonce");
        //随机字符串
        String echostr = request.getParameter("echostr");
        PrintWriter out = null;

        log.info("signature====" + signature);
        log.info("timestamp====" + timestamp);
        log.info("nonce====" + nonce);
        log.info("echostr====" + echostr);

        try {
            out = response.getWriter();
            if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
                out.write(echostr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }
}
