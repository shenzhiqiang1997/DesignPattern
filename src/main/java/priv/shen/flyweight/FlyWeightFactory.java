package priv.shen.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String,FlyWeight> flyWeights = new HashMap<>();
    public FlyWeight getFlyWeight(String intrinsicState){
        FlyWeight flyWeight = flyWeights.get(intrinsicState);
        if (flyWeight == null){
            flyWeight = new ConcreteFlyWeight(intrinsicState);
            flyWeights.put(intrinsicState,flyWeight);
        }
        return flyWeight;
    }
}
