package com.jiangnanyidianyu.service;
import com.jiangnanyidianyu.bean.user;
import com.jiangnanyidianyu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/29 17:13
 */
@Service
public class UserService {

//    @Autowired //连接到UserDao Bean
//    private UserDao userDao;
//
//    public String show() {
//        return "Hello World!";
//    }
//
//    public List<user> showDao(String userid) {
//        return userDao.get(userid);
//    }
//
//    public String insert(String userid, String username,String pwd,String mark) { //插入一条记录
//        user user = new user();
//        user.setUserid(userid);
//        user.setUsername(username);
//        user.setPwd(pwd);
//        user.setMark(mark);
//        userDao.insert(user);
//        return "Insert ( \""+userid+"\", username:"+username+",pwd:"+ pwd +",mark:" + mark+") OK!";
//    }



}
