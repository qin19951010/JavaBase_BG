package com.jiangnanyidianyu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName Author
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/29 10:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Alias(value = "author") //mybatis指定的别名
@Component
public class Author {
    private Integer id;
    private String name;
    private Integer age;
    private List<Book> books;
    private List<String> hobbys;
}
