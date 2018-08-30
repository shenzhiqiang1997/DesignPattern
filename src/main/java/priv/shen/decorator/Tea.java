package priv.shen.decorator;

// 被装饰类
public class Tea implements Drink {
    @Override
    public double cost() {
        return 1;
    }
}
