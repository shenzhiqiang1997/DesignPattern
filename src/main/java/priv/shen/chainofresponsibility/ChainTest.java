package priv.shen.chainofresponsibility;

public class ChainTest {
    public static void main(String[] args) {
        Request request1 = new Request(RequestType.type1,"request1");
        Request request2 = new Request(RequestType.type2,"request2");

        Handler concreteHandler2 = new ConcreteHandler2(null);
        Handler concreteHandler1 = new ConcreteHandler1(concreteHandler2);

        concreteHandler1.handleRequest(request1);
        concreteHandler1.handleRequest(request2);
    }
}
