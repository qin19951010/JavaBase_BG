package com.jiangnanyidianyu.代理模式.抽象工厂模式;

import com.jiangnanyidianyu.代理模式.简单工厂模式.Phone;

public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
