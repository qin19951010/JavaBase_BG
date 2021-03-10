package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/*
*
*
*   TODO 动态代理类
*
*/

public class DynProxyLawyer implements InvocationHandler {

    private Object target;//被代理的对象

    public DynProxyLawyer(Object obj){
        this.target=obj;
    }

    @Override

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展："+method.getName());
        Object result=method.invoke(target,args);
        return result;
    }
}
