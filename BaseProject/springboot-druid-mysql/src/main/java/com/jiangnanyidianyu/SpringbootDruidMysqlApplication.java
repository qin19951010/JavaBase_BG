package com.jiangnanyidianyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@MapperScan({"com.jiangnanyidianyu.dao,com.jiangnanyidianyu.mbg.mapper"})
public class SpringbootDruidMysqlApplication /*implements CommandLineRunner */{

//    @Autowired
//    private ApplicationContext appContext;
//
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SpringApplication.class);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
////        String[] beans = appContext.getBeanDefinitionNames();
////        Arrays.sort(beans);
////        for (String bean : beans)
////        {
////            System.out.println(bean + " of Type :: " + appContext.getBean(bean).getClass());
////        }
//        Object user = appContext.getBean("user");
//        System.out.printf("user==================" + user.toString());
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDruidMysqlApplication.class, args);
    }

}
