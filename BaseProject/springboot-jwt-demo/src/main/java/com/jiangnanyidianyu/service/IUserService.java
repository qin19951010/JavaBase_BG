package com.jiangnanyidianyu.service;

import com.jiangnanyidianyu.Beans.User;

/**
 * @author: Milogenius
 * @create: 2019-07-08 11:20
 * @description:
 **/
public interface IUserService {

    /**
     * 校验用户信息
     * @param loginName
     * @param passWord
     * @return
     */
    boolean checkUser(String loginName, String passWord);

    /**
     * 查询用户信息
     * @param loginName
     * @return
     */
    User getUser(String loginName);
}
