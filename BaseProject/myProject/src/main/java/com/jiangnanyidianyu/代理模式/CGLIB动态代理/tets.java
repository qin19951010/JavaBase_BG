package com.jiangnanyidianyu.代理模式.CGLIB动态代理;

/**
 * @ClassName tets
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/13 15:30
 */
public class tets {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("cglib动态代理");
    }
}
