package com.jiangnanyidianyu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName BaseMessage
 * @Author: Qinnn、
 * @Description: TODO   回复消息的基类
 * @Date: create in 2020/9/23 13:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseMessage {

    protected String ToUserName;
    protected String FromUserName;
    protected long CreateTime;
    protected String MsgType;

}
