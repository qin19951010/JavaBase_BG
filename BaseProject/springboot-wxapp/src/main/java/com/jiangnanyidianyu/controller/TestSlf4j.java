package com.jiangnanyidianyu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName TestSlf4j
 * @Author: Qinnn、
 * @Description: TODO Slf4j日志测试
 * @Date: create in 2020/9/22 14:34
 */

@Slf4j
@RestController
public class TestSlf4j {

    @RequestMapping("/log")
    public String testLog(){

        log.info("#########  info  #########");
        //log.debug("#########  debug  #########");
        log.error("#########  error  #########");
        return null;
    }

    @RequestMapping("/Test")
    public String test(){

        return "内网穿透测试!!";
    }
}
