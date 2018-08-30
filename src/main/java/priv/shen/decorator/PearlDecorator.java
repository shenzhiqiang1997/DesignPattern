package priv.shen.decorator;

public class PearlDecorator extends CondimentDecorator{
    public PearlDecorator(Drink drink){
        super(drink);
    }

    @Override
    public double cost() {
        return drink.cost()+1;
    }
}
