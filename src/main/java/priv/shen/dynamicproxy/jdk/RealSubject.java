package priv.shen.dynamicproxy.jdk;

// 真实主体
public class RealSubject implements Subject{
    public void hello(){
        System.out.println("Hello World.");
    }
}
