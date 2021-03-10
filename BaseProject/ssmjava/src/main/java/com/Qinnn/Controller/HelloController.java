package com.Qinnn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName HelloController
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/21 10:52
 */
@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("hello2")
    public String hello2()
    {
        System.out.println("执行了controller！");
        return "index";
    }

    @GetMapping("/date")
    public List<String> getDate()
    {
        List<String> list = Arrays.asList("java", "js", "mysql");

        return list;
    }
}
