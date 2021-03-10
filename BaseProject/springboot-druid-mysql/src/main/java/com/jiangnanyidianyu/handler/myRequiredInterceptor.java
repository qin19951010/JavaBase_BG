package com.jiangnanyidianyu.handler;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName myRequiredInterceptor
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/28 17:30
 */
public class myRequiredInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
