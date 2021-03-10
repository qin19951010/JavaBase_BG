package com.jiangnanyidianyu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @ClassName user
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/29 13:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Alias(value = "user") //mybatis指定的别名
@Component
@PropertySource("classpath:user.properties")
@ConfigurationProperties(prefix = "user")
public class user {

    public String userid;

    public String username;

    public String pwd;

    private List<String> favorites;

    private Date regTime;

    public String mark;
}
