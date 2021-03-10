package com.jiangnanyidianyu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName stringController
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/28 13:54
 */
@Controller
public class stringController {

    @RequestMapping("/hello55")
    public String hello5(Model model)
    {
        model.addAttribute("user","javaboy");
        return "hello";
    }

    @RequestMapping("/hello6")
    public String hello6()
    {
        return "forward:WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("/hello7")
    public String hello7()
    {
        return "redirect:/hello";
    }


    @ResponseBody
    @RequestMapping("/hello8")
    public String hello8()
    {
        return "redirect:/user/hello";
    }

    @ResponseBody
    @RequestMapping(value = "/hello9",produces = "text/html;charset=UTF-8")
    public String hello9()
    {
        return "JAVA程序设计";
    }
}
