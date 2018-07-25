package trytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GuiTaiA implements InvocationHandler {
//    private SellWine maoTaiJiu;
//
//    public GuiTaiA(SellWine maoTaiJiu) {
//        this.maoTaiJiu = maoTaiJiu;
//    }
//
//    @Override
//    public void sellWine() {
//        System.out.println("柜台a开始销售");
//        maoTaiJiu.sellWine();
//        System.out.println("柜台a结束销售");
//    }
    private Object pingTai;

    public GuiTaiA(Object pingTai) {
        this.pingTai = pingTai;
    }
    //@autowire解析
//    https://blog.csdn.net/wenluoxicheng/article/details/73608657
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("销售开始,平台是:"+pingTai);
        method.invoke(pingTai,args);
        System.out.println("销售结束,平台是:"+pingTai);

        return null;
    }
}
