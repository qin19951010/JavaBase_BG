package com.jiangnanyidianyu.代理模式.工厂方法模式;

import com.jiangnanyidianyu.代理模式.简单工厂模式.Phone;
import org.junit.Test;

/**
 * @ClassName test
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/15 10:56
 */
public class test {
    @Test
    public void test()
    {
        IphoneFactory iphoneFactory = new IphoneFactory();
        Phone iphone = iphoneFactory.makePhone();

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        Phone miPhone = xiaoMiFactory.makePhone();
    }
}
