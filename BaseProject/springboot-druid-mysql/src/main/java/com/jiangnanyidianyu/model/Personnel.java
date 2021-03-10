package com.jiangnanyidianyu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName Personnel
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/29 14:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
@Alias("personnel")
public class Personnel {

    private Integer id;
    private String username;
    private String password;
    private List<Role> roles;

}
