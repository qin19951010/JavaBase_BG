package com.jiangnanyidianyu.utils;

import com.jiangnanyidianyu.bean.Image;
import com.jiangnanyidianyu.bean.ImageMessage;
import com.jiangnanyidianyu.service.BaseMessageUtil;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;

/**
 * @ClassName ImageMessageUtil
 * @Author: Qinnn、
 * @Description: TODO   封装信息回复xml
 * @Date: create in 2020/9/24 11:31
 */
public class ImageMessageUtil implements BaseMessageUtil<ImageMessage> {
    @Override
    public String messageToxml(ImageMessage imageMessage) {
        XStream xtream = new XStream();
        xtream.alias("xml", imageMessage.getClass());
        xtream.alias("Image", new Image().getClass());
        return xtream.toXML(imageMessage);
    }

    @Override
    public String initMessage(String FromUserName, String ToUserName) {
        Image image = new Image();
        image.setMediaId(getmediaId());
        ImageMessage message = new ImageMessage();
        message.setFromUserName(ToUserName);
        message.setToUserName(FromUserName);
        message.setCreateTime(new Date().getTime());
        message.setImage(image);
        message.setMsgType("image");
        return messageToxml(message);
    }

    public String getmediaId(){
        String path = "D:/wxapp/Qinnn.jpg";
        String accessToken = WeiXinUtil.getAccess_Token();
        String mediaId = null;
        try {
            mediaId = UploadUtil.upload(path, accessToken, "image");

        } catch (KeyManagementException | NoSuchAlgorithmException
                | NoSuchProviderException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mediaId;
    }
}
