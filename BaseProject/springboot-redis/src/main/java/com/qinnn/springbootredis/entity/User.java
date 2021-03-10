package com.qinnn.springbootredis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/26 11:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Integer id;
    String username;
    String password;
}
