package com.Qinnn.Config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @ClassName SpringMvcConfig
 * @Author: Qinnn、
 * @Description: TODO   SpringMvc配置
 * @Date: create in 2020/10/21 10:19
 */
@Configuration
/**
 *
 *  由于我们在 WebInit 中只是添加了 SpringMVC 的配置，这样项目在启动时只会去加载 SpringMVC 容 器，
 *  而不会去加载 Spring 容器，如果一定要加载 Spring 容器，需要我们修改 SpringMVC 的配置，
 *  在 SpringMVC 配置的包扫描中也去扫描 @Configuration 注解，
 *  进而加载 Spring 容器，还有一种方案可以解决这个问题，就是直接在项目中舍弃 Spring 配置，
 *  直接将所有配置放到 SpringMVC 的配置中来完 成，这个在 SSM 整合时是没有问题的，
 *  在实际开发中，较多采用第二种方案，第二种方案， SpringMVC 的配置如下：
 *
 */
@ComponentScan(basePackages = "com.Qinnn"/*,useDefaultFilters = false,includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
}*/)
public class SpringMvcConfig extends WebMvcConfigurationSupport {

    /** 1.配置静态资源过滤
     *  xml:<mvc:resources mapping="/**" location="/"/>
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        /** resources:resources 目录下 */
        registry.addResourceHandler("/jsp/**").addResourceLocations("classpath:/webapp");
    }

    /** 2.配置视图解析器
     *  <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"> ‘
     *      <property name="prefix" value="/WEB-INF/jsp/"/> <property name="suffix" value=".jsp"/>
     * </bean>
     */
    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/jsp/",".jsp");
    }

    /** 3.路径映射
     *
     *  有时控制器的作用仅仅是跳转功能,可以直接通过路径映射来实现页面访问。
     *  xml：<mvc:view-controller path="/hello" view-name="hello" status-code="200"/>
     *  这行配置，表示如果用户访问 /hello 这个路径，
     *  则直接将名为 hello 的视图返回给用户，并且响应 码为 200
     */
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        /** 访问/hello3这个路径,直接通过视图解析器跳转到hello.jsp
         *  controller配置了相同路径,最终会执行controller中的内容
         */
        registry.addViewController("/hello2").setViewName("hello");
    }

    /** 4.Json配置
     *  SpringMVC可以接收Json参数,也可以返回JSON参数,这一切依赖于HttpMessageConverter
     *
     *  SpringMVC 中，默认提供了 Jackson 和 gson 的 HttpMessageConverter,
     *  分别是: MappingJackson2HttpMessageConverter 和 GsonHttpMessageConverter 。
     *
     *  如果使用JSon,对于jackson和Gson只需要添加依赖,加完依赖就可以直接使用了。具体配置在
     *  AllEncompassingFormHttpMessageConverter中完成
     *
     *  如果需要使用fastjson,默认情况下SpringMvc没有提供fastjson的HttpMessageConverter
     *  ,需要自己配置
     *
     *  xml: 添加依赖+显示配置HttpMessageConverter
     *  <mvc:annotation-driven>
     *    <mvc:message-converters>
     *      <bean class="com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter">
     *      </bean>
     *    </mvc:message-converters>
     * </mvc:annotation-driven>
     */

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        /**  */
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converter.setDefaultCharset(Charset.forName("UTF-8"));

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setCharset(Charset.forName("UTF-8"));

        converter.setFastJsonConfig(fastJsonConfig);
        converters.add(converter);
    }
}
