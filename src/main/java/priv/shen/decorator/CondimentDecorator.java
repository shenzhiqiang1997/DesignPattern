package priv.shen.decorator;

// 装饰类
public abstract class CondimentDecorator implements Drink{
    protected Drink drink;

    public CondimentDecorator(Drink drink){
        this.drink = drink;
    }
}
