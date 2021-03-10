package com.jiangnanyidianyu.service;

/**
 * @ClassName BaseMessageUtil
 * @Author: Qinnn、
 * @Description: TODO 消息封装工具类的基类,这里采用泛型,方便后期功能扩展
 * @Date: create in 2020/9/22 14:34
 */

public interface BaseMessageUtil<T> {

    /**
     * 将回复的信息对象转xml格式给微信
     * @param t
     * @return
     */
    String messageToxml(T t);

    /**
     * 回复的信息封装
     * @param FromUserName
     * @param ToUserName
     * @param FromUserName,ToUserName
     * @return
     */
    String initMessage(String FromUserName,String ToUserName);

}
