package com.jiangnanyidianyu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        System.out.println("Hello!");
        return "index";
    }

    @RequestMapping("/hello/{user}")
    public ModelAndView HelloUser(@PathVariable String user) {

        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("user","Qinnn");
        return modelAndView;
    }

    /**
    **
     * @Author Qinnn
     * @Description //TODO 通过HttpServletRequest做服务端跳转
     * @Date 9:21 2020/9/28
     * @Param
     * @return
     **/
    @RequestMapping("/hello2")
    public void hello2(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(req,resp);
    }

    /**
    **
     * @Author Qinnn
     * @Description TODO  通过HttpServletResponse做重定向     ??
     * @Date 9:24 2020/9/28
     * @Param
     * @return
     **/
    @RequestMapping("/hello3")
    public void hello3(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        resp.sendRedirect("http:www.baidu.com");
    }

    /**
    **
     * @Author Qinnn
     * @Description TODO  手动指定响应头实现重定向   ??
     * @Date 9:28 2020/9/28
     * @Param
     * @return
     **/
    @RequestMapping("/hello4")
    public void hello4(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        resp.setStatus(302);
        resp.addHeader("Location","/jsp/hello.jsp");
    }

    /**
     **
     * @Author Qinnn
     * @Description TODO  通过HttpServletResponse给出响应  这种方式既可以返回JSON,也可以返回字符串
     * @Date 9:28 2020/9/28
     * @Param
     * @return
     **/
    @RequestMapping("/hello5")
    public void hello5(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.write("hello javaboy!");
        out.flush();
        out.close();
    }
}
