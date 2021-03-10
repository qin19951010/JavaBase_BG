package com.jiangnanyidianyu;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

/**
 * @ClassName MyTest
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/22 14:44
 */
public class MyTest {

    @Test
    public void myTest()
    {
        System.out.println(RandomStringUtils.randomNumeric(5));
    }

    @Test
    public void picTobase64() throws Exception {
        String imgStr = getImgStr("C:\\\\Users\\\\Administrator\\\\Pictures\\\\QQ图片222.jpg");
        System.out.println(imgStr);


        //String temp = encodeBase64File("C:\\Users\\Administrator\\Pictures\\QQ图片20201105104938.jpg");
        //System.out.println(temp);

        decoderBase64File(imgStr,"C:\\Users\\Administrator\\Pictures\\QQ图片333.jpg");
    }

    public static String encodeBase64File(String path) throws Exception {
        File file = new File(path);;
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return new BASE64Encoder().encode(buffer);
    }

    public static void decoderBase64File(String base64Code, String targetPath)
            throws Exception {
        byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
        FileOutputStream out = new FileOutputStream(targetPath);
        out.write(buffer);
        out.close();
    }

    public static String getImgStr(String imgFile){
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try
        {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return new String(Base64.encodeBase64(data));
    }
}
