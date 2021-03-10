package ProxyPattern;
/*
*
*   TODO 代理律师诉讼类，实现ILawSuit接口
*
*/
public class ProxyLawyer implements ILawSuit {

    ILawSuit plaintiff;//持有要代理的那个对象

    public ProxyLawyer(ILawSuit plaintiff) {
        this.plaintiff=plaintiff;
    }

    @Override
    public void submit(String proof) {
        plaintiff.submit(proof);
    }

    @Override
    public void defend() {
        plaintiff.defend();
    }
}
