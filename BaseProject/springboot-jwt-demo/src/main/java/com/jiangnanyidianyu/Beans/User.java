package com.jiangnanyidianyu.Beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Milogenius
 * @create: 2019-07-08 11:23
 * @description: 用户
 **/
//@Data : 注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
@Data
//@NoArgsConstructor : 注在类上，提供类的无参构造
@NoArgsConstructor
//@AllArgsConstructor : 注在类上，提供类的全参构造
@AllArgsConstructor
public class User {

    /**
     * 昵称
     */
    private String name;
    /**
     * 密码
     */
    private String password;
}
