package com.jiangnanyidianyu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * @ClassName Role
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/29 14:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
@Alias("role")
public class Role {

    private Integer id;
    private String name;
    private String nameZh;

}
