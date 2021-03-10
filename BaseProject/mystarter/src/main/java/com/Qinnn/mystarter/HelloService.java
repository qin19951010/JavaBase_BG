package com.Qinnn.mystarter;

/**
 * @ClassName HelloService
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/21 14:51
 */
public class HelloService {

    private String msg;
    private String name;

    public String sayHello()
    {
        return name + "say" + msg + "!";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
