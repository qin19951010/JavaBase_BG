package com.jiangnanyidianyu.代理模式.工厂方法模式;

import com.jiangnanyidianyu.代理模式.简单工厂模式.MiPhone;
import com.jiangnanyidianyu.代理模式.简单工厂模式.Phone;

/**
 * @ClassName XiaoMiFactory
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/15 10:54
 */
public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}
