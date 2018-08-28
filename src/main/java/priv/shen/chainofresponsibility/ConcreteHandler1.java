package priv.shen.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor){
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request!=null
                && request.getRequestType() == RequestType.type1){
            System.out.println(request.getName()+" handled by "+getClass().getSimpleName());
            return;
        }

        if (successor != null){
            successor.handleRequest(request);
        }
    }
}
