package com.qinnn.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName OptimisticLockerInterceptor
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/22 16:21
 */
@Configuration
public class MpConfig {
    //乐观锁拦截器
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }

    //性能拦截器
    @Bean
    // @Profile({"dev,test"})
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        // 格式化sql输出
        performanceInterceptor.setFormat(true);
        // 设置sql执行最大时间，单位（ms）
        performanceInterceptor.setMaxTime(30000L);
//        performanceInterceptor.setWriteInLog(true);
        return performanceInterceptor;
    }
}
