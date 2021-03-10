package ProxyPattern;

public class Test {

    public static void main(String[] args) {

/*        ProxyFactory.getProxyNiu().submit("工资流水在此");
        ProxyFactory.getProxyNiu().defend();*/

        ILawSuit proxy= (ILawSuit) ProxyFactory.getDynProxy(new CuiHuaNiu());
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}
