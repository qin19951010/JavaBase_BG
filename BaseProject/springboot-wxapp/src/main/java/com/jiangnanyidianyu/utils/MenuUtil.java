package com.jiangnanyidianyu.utils;

import com.jiangnanyidianyu.bean.Button;
import com.jiangnanyidianyu.bean.ClickButton;
import com.jiangnanyidianyu.bean.Menu;
import com.jiangnanyidianyu.bean.ViewButton;
import com.jiangnanyidianyu.utils.WeiXinUtil;
import net.sf.json.JSONObject;
import org.omg.CORBA.portable.Delegate;

/**
 * @ClassName MenuUtil
 * @Author: Qinnn、
 * @Description: TODO   菜单工具
 * @Date: create in 2020/9/25 10:41
 */
public class MenuUtil {

    /**
    *   必须使用Https请求
    */

    /**菜单创建URL*/
    private static final String CTRATE_MENU_URL  = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";

    /**菜单删除URL*/
    private static final String DELETE_MENU_URL  = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";

    /**
    **
     * @Author Qinnn
     * @Description //TODO 创建菜单
     * @Date 13:26 2020/9/25
     * @Param
     * @return
     **/
    public static int createMenu(String accessToken,String Menu){
        int result = Integer.MIN_VALUE;
        String url = CTRATE_MENU_URL.replaceAll("ACCESS_TOKEN", accessToken);
        JSONObject json = WeiXinUtil.doPoststr(url, Menu);
        if(json!=null){
            //从返回的数据包中取数据{"errcode":0,"errmsg":"ok"}
            result = json.getInt("errcode");
        }
        return result;
    }

    /**
    **
     * @Author Qinnn
     * @Description //TODO  删除菜单
     * @Date 13:28 2020/9/25
     * @Param
     * @return
     **/
    public static int deleteMenu(String accessToken)
    {
        int result = Integer.MIN_VALUE;
        String url = DELETE_MENU_URL.replaceAll("ACCESS_TOKEN", accessToken);
        JSONObject json = WeiXinUtil.doGetstr(url);
        if(json!=null){
            //从返回的数据包中取数据{"errcode":0,"errmsg":"ok"}
            result = json.getInt("errcode");
        }
        return result;
    }

    /**
    **
     * @Author Qinnn
     * @Description //TODO  菜单配置
     * @Date 13:29 2020/9/25
     * @Param
     * @return
     **/
    public static String initMenu(){
        String result = "";
        //创建点击一级菜单
        ClickButton button11 = new ClickButton();
        button11.setName("往期活动");
        button11.setKey("11");
        button11.setType("click");

        //创建跳转型一级菜单
        ViewButton button21 = new ViewButton();
        button21.setName("嘉和美康");
        button21.setType("view");
        button21.setUrl("http://www.goodwillcis.com/");

        //创建其他类型的菜单与click型用法一致
        ClickButton button31 = new ClickButton();
        button31.setName("拍照发图");
        button31.setType("pic_photo_or_album");
        button31.setKey("31");

        ClickButton button32 = new ClickButton();
        button32.setName("发送位置");
        button32.setKey("32");
        button32.setType("location_select");

        ClickButton button33 = new ClickButton();
        button33.setName("需求提交");
        button33.setKey("33");
        button33.setType("click");

        ClickButton button34 = new ClickButton();
        button34.setName("需求查询");
        button34.setKey("34");
        button34.setType("click");

        //封装到一级菜单
        Button button = new Button();
        button.setName("服务菜单");
        button.setType("click");
        button.setSub_button(new Button[]{button31,button32,button33,button34});

        //封装菜单
        Menu menu = new Menu();
        menu.setButton(new Button[]{button11,button21,button});
        return JSONObject.fromObject(menu).toString();
    }
}

