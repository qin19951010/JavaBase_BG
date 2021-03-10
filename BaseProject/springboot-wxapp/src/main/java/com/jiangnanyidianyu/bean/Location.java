package com.jiangnanyidianyu.bean;

import com.jiangnanyidianyu.utils.Utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Location
 * @Author: Qinnn、
 * @Description: TODO   地理位置信息
 * @Date: create in 2020/9/25 14:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location{

    /**地理纬度信息*/
    public String Location_X;
    /**地理经度信息*/
    public String Location_Y;
    /**具体地理信息*/
    public String Label;
    /**发送时间*/
    public long CreateTime;

    @Override
    public String toString() {
        return "根据您" + Utils.LongToDateStr(CreateTime) + "发送的地理位置显示:" + "\n" + "您目前所在的地理纬度为:["+ Location_X +"]," + "\n" + "地理纬度为:["+ Location_Y +
                "]," + "\n" + "具体其位置为:[" + Label + "];";
    }
}
