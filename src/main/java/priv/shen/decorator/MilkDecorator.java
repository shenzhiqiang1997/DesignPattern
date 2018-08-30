package priv.shen.decorator;

public class MilkDecorator extends CondimentDecorator {

    public MilkDecorator(Drink drink){
        super(drink);
    }

    @Override
    public double cost() {
        return drink.cost()+1;
    }
}
