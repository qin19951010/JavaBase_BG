package com.Qinnn.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ClassName SpringConfig
 * @Author: Qinnn、
 * @Description: TODO Spring配置
 * @Date: create in 2020/10/21 10:12
 */

/** useDefaultFilters默认是true，扫描带有@Component or @Repository or @Service or @Controller 的组件
 其中@Repository @Service @Controller都实现了@Component */
@Configuration
@ComponentScan(basePackages = "com.Qinnn",useDefaultFilters = true,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class SpringConfig {

}
