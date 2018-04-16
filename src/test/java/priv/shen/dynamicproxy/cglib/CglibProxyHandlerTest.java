package priv.shen.dynamicproxy.cglib;

import org.junit.Test;

public class CglibProxyHandlerTest {
    @Test
    public void test(){
        RealSubject realSubject = new RealSubject();
        CglibProxyHandler cglibProxyHandler = new CglibProxyHandler(realSubject);
        RealSubject proxySubject = (RealSubject) cglibProxyHandler.getProxy();
        proxySubject.hello();
    }
}
