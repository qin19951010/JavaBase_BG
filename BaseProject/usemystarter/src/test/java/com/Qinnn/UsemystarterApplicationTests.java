package com.Qinnn;

import com.Qinnn.mystarter.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsemystarterApplicationTests {

    @Autowired
    HelloService helloService;

    @Test
    void contextLoads() {

        helloService.sayHello();

    }

}
