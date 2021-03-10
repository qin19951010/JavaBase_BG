package com.jiangnanyidianyu.controller;

import com.jiangnanyidianyu.bean.user;
import com.jiangnanyidianyu.dao.UserDao;
import com.jiangnanyidianyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName mybatisTest
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/29 14:59
 */
@RestController
public class mybatisTest {

//    @Autowired
//    UserDao userDao;
//
//    @Autowired
//    UserService userService;
//
//    @GetMapping("querymybatis/{id}")
//    public user Query(@PathVariable String id)
//    {
//        user user = userDao.getUserById(id);
//        return user;
//    }
//
//    @RequestMapping(value = "/show")
//    public String show() {
//        return userService.show();
//    }
//
//    @GetMapping(value = "/showDao/{userid}")
//    public List<user> showDao(@PathVariable String userid) {
//        return userService.showDao(userid);
//    }
//
//    @RequestMapping(value="/insert")
//    public String insert(String userid, String username,String pwd,String mark) {
//        return userService.insert(userid, username,pwd,mark);
//    }
}
