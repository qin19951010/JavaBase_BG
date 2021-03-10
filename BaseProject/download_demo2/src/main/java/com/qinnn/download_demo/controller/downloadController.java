package com.qinnn.download_demo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @ClassName downloadController
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/3/9 15:05
 */
@RestController
public class downloadController {

    @GetMapping("/netDownLoadNet")
    public String netDownLoadNet(@Param(value = "filename") String filename, @Param(value = "isOnLine") boolean isOnLine, HttpServletResponse response) throws Exception {
        filename = filename + ".jpg";
        String netAddress = "https://www.dqdl.net/assets/addons/cms/img/logo.png";
        URL url = new URL(netAddress);
        URLConnection conn = url.openConnection();
        InputStream inputStream = conn.getInputStream();

        response.reset();
        response.setContentType(conn.getContentType());
        if (isOnLine) {
            // 在线打开方式 文件名应该编码成UTF-8
            response.setHeader("Content-Disposition", "inline; filename=" + URLEncoder.encode(filename, "UTF-8"));
        } else {
            //纯下载方式 文件名应该编码成UTF-8
            response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(filename, "UTF-8"));
        }

        byte[] buffer = new byte[1024];
        int len;
        OutputStream outputStream = response.getOutputStream();
        while ((len = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, len);
        }
        inputStream.close();
        return "下载成功！";
    }
}
