package priv.shen.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyHandler implements MethodInterceptor {
    // 被代理的对象
    private Object target;
    public CglibProxyHandler(Object target){
        this.target = target;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        // 设置代理对象的父类
        enhancer.setSuperclass(target.getClass());
        // 设置代理对象的方法回调
        enhancer.setCallback(this);
        // 生成代理类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 增强逻辑
        System.out.println("handle before...");
        // 调用了代理对象的父类的方法 即调用被代理对象的方法
        Object result = methodProxy.invoke(target,args);
        // 增强逻辑
        System.out.println("handle after...");
        return result;
    }
}
