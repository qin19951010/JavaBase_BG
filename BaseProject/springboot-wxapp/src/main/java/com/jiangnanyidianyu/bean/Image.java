package com.jiangnanyidianyu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName Image
 * @Author: Qinnn、
 * @Description: TODO   图片bean
 * @Date: create in 2020/9/23 16:08
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    private String MediaId;//素材id

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
