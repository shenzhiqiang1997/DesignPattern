package priv.shen.dynamicproxy.jdk;

import org.junit.Test;

public class JdkProxyHandlerTest {
    @Test
    public void test(){
        // 被代理对象
        Subject realSubject= new RealSubject();

        JdkProxyHandler jdkProxyHandler = new JdkProxyHandler(realSubject);
        // 生成代理对象
        Subject proxySubject = (Subject) jdkProxyHandler.getProxy();
        proxySubject.hello();
    }
}

