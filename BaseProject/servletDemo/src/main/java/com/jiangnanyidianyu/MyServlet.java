package com.jiangnanyidianyu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    /*
    *   1.Servlet接口中三个主要方法:
    *     1)init()
    *     2)service(ServletRequest req, ServletResponse res) throws ServletException, IOException;
    *     3)destroy()
    *
    *     1.抽象类GenericServlet 实现接口 Servlet
    *     2.更为全面的抽象类HttpServlet,继承了GenericServlet
    */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        this.doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        response.getWriter().write("hello,I am Servlet");
    }
}
