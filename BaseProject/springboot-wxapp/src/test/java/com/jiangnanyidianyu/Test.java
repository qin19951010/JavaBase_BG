package com.jiangnanyidianyu;

import com.jiangnanyidianyu.bean.Location;
import com.jiangnanyidianyu.utils.MenuUtil;
import com.jiangnanyidianyu.utils.UploadUtil;
import com.jiangnanyidianyu.utils.WeiXinUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * @ClassName Test
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/23 18:03
 */
@Slf4j
public class Test {

//    public static void main(String[] args) {
//        String access_token = WeiXinUtil.getAccess_Token();
//        System.out.println("调用成功access_token:"+access_token);
//    }
    /**
    *
     * @Author Qinnn
     * @Description //TODO  测试Token获取,先从缓存中查找,没有的话从接口调取
     * @Date 11:50 2020/9/24
     * @Param
     * @return
     */
    @org.junit.jupiter.api.Test
    public void Test01()
    {
        String access_token = WeiXinUtil.getAccess_Token();
        System.out.println("调用成功access_token:"+access_token);
    }

    @org.junit.jupiter.api.Test
    public void TestImageUpload()
    {
        String access_token = WeiXinUtil.getAccess_Token();
        String path = "D:/wxapp/Qinnn.jpg";
        try {
            String mediaId = UploadUtil.upload(path,access_token,"image");
            log.info("mediaId====" + mediaId);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    public void TestCreateMenu()
    {
        String accessToken  = WeiXinUtil.getAccess_Token();
        String menu = MenuUtil.initMenu();
        System.out.println(menu);
        int result = MenuUtil.createMenu(accessToken,menu);
        if(result==0){
            System.out.println("菜单创建成功");
        }else{
            System.out.println("错误码"+result);
        }
    }

    @org.junit.jupiter.api.Test
    public void TestDeletMenu()
    {
        String accessToken  = WeiXinUtil.getAccess_Token();
        int result = MenuUtil.deleteMenu(accessToken);
        if(result==0){
            System.out.println("菜单删除成功");
        }else{
            System.out.println("错误码"+result);
        }
    }

    @org.junit.jupiter.api.Test
    public void MyTest()
    {
        Location location = new Location("111","222","关山大道K11",12321321321L);
        log.info(location.toString());
    }
}
