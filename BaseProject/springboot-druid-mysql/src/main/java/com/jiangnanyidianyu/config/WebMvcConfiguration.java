package com.jiangnanyidianyu.config;

import com.jiangnanyidianyu.handler.myRequiredInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @ClassName WebMvcConfiguration
 * @Author: Qinnn、
 * @Description: TODO  拦截器
 * @Date: create in 2020/10/28 17:23
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    /** 拦截器 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //myRequiredInterceptor()
        registry.addInterceptor(new myRequiredInterceptor()).addPathPatterns("/**").excludePathPatterns(Arrays.asList("/plug-ins/**"));
    }

    /** 配置视图控制器 */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/mdToHtml");
    }
}
