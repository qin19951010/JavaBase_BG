package com.jiangnanyidianyu.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName DruidConfig
 * @Author: Qinnn、
 * @Description: TODO   Druid数据源配置
 * @Date: create in 2020/9/29 11:33
 */
@Configuration
public class DruidConfig {

    /* 自定义Druid数据源,属性设置读取配置文件 */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid()
    {
        return new DruidDataSource();
    }

    /* 自定义Servlet注册 */
    @Bean
    public ServletRegistrationBean servletRegistrationBean()
    {
        /** 创建一个新的ServletRegistrationBean具有指定实例Servlet和URL映射 */
        ServletRegistrationBean<Servlet> registrationBean
                = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

        HashMap<String, String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","admin");
        /* 配置白名单和黑名单,为空则默认所有人都可以访问 */
        initParams.put("allow","");
        initParams.put("deny","");

        registrationBean.setInitParameters(initParams);

        return registrationBean;
    }

    /* 自定义Filter注册 */
    @Bean
    public FilterRegistrationBean filterRegistrationBean()
    {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();

        HashMap<String, String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/*");

        /* 用于配置Web和Druid数据源之间的管理关联监控统计 */
        bean.setFilter(new WebStatFilter());
        /* 设置初始化参数 */
        bean.setInitParameters(initParams);
        /* 设置url过滤规则 */
        bean.setUrlPatterns(Arrays.asList("/*"));

        return bean;
    }

}
