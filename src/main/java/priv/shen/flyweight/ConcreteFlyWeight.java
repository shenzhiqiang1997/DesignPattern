package priv.shen.flyweight;

public class ConcreteFlyWeight implements FlyWeight {
    private String intrinsicState;

    public ConcreteFlyWeight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operate(String extrinsicState) {
        System.out.println("intrinsicState:"+intrinsicState);
        System.out.println("extrinsicState:"+extrinsicState);
    }
}
