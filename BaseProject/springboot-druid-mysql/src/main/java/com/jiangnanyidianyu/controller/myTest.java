package com.jiangnanyidianyu.controller;

import com.jiangnanyidianyu.bean.md;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @ClassName myTest
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/27 15:24
 */
@Controller
public class myTest {

    @GetMapping("/submit")
    public void submitMD(@ModelAttribute(value="md") md md)
    {
        System.out.println("提交内容为:" + md.toString());
    }

    @GetMapping("/index")
    public String showMD()
    {
        return "demo";
    }
}
