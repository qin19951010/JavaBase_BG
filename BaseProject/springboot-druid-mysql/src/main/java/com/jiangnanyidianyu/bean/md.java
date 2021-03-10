package com.jiangnanyidianyu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * @ClassName md
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/27 15:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Alias(value = "md") //mybatis指定的别名
@Component
public class md
{
    private Integer id;
    private String content;
}
