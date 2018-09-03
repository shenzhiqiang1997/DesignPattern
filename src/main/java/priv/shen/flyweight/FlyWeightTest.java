package priv.shen.flyweight;

public class FlyWeightTest {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        FlyWeight flyWeight = flyWeightFactory.getFlyWeight("flyWeight");
        flyWeight.operate("A");
        flyWeight.operate("B");

    }
}
