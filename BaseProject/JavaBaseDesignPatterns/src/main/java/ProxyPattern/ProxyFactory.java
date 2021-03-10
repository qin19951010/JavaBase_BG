package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
*
*   TODO 产生代理对象的静态代理工厂类
*
*/
public class ProxyFactory {

//    public static ILawSuit getProxy(){
//        return new ProxyLawyer(new SecondDogWang());
//    }
//
//    public static ILawSuit getProxyNiu(){
//        return new ProxyLawyer(new CuiHuaNiu());
//    }

    public static Object getDynProxy(Object target) {
        InvocationHandler handler = new DynProxyLawyer(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }
}
