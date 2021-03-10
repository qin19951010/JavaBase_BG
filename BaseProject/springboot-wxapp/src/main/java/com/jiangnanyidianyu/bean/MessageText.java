package com.jiangnanyidianyu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MessageText
 * @Author: Qinnn、
 * @Description: TODO   消息内容实体
 * @Date: create in 2020/9/23 13:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageText extends BaseMessage {

    private String Content;//文本消息内容

    private String MsgId;//消息id，64位整型

    public MessageText(String toUserName, String fromUserName,
                       long createTime, String msgType, String content, String msgId) {
        super();
        ToUserName = toUserName;
        FromUserName = fromUserName;
        CreateTime = createTime;
        MsgType = msgType;
        Content = content;
        MsgId = msgId;
    }
}
