package com.jiangnanyidianyu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @ClassName Book
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/29 10:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Alias(value = "book") //mybatis指定的别名
@Component
public class Book {

    private Integer id;
    private String name;
    private Author author;
}
