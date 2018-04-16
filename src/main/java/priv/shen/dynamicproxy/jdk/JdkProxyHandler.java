package priv.shen.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyHandler implements InvocationHandler{
    // 被代理对象
    private Object target;

    public JdkProxyHandler(Object target){
        this.target = target;
    }

    public Object getProxy(){
        // 根据被代理对象的类加载器，接口以及具体的增强调用来生成代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强逻辑
        System.out.println("handle before...");
        // 调用被代理对象原方法
        Object result = method.invoke(target,args);
        // 增强逻辑
        System.out.println("handle after...");

        return result;
    }
}
