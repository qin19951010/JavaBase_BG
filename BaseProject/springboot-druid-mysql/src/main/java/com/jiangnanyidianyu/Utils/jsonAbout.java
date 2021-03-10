package com.jiangnanyidianyu.Utils;

import java.io.*;

/**
 * @ClassName jsonAbout
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/26 14:18
 */
public class jsonAbout {

    public static void outFileByString(String filePath,String content)
    {

        File f=new File(filePath);//新建一个文件对象，如果不存在则创建一个该文件
        FileWriter fw;
        try {
            fw=new FileWriter(f);
            fw.write(content);//将字符串写入到指定的路径下的文件中
            fw.close();
        } catch (IOException e) { e.printStackTrace(); }
    }
}
