package com.Qinnn.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @ClassName webInit
 * @Author: Qinnn、
 * @Description: TODO web.xml
 * @Date: create in 2020/10/21 10:22
 */


/**
 *  onStartup 方法会被自动执行，我们可以在这个方法中做一些项目初始化操作，
 *  例如加载 SpringMVC 容器，添加过滤器，添加 Listener、添加 Servlet 等。
 */
public class webInit implements WebApplicationInitializer
{
    public void onStartup(ServletContext servletContext) throws ServletException {
        //加载SpringMvc的配置文件
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class);
        //添加添加 DispatcherServlet
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc", new DispatcherServlet(context));
        //给DispatcherServlet添加路径映射
        springmvc.addMapping("/");
        //给DispatcherServlet添加启动时机
        springmvc.setLoadOnStartup(1);
    }
}
