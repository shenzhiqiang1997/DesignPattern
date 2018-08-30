package priv.shen.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Drink drink = new Tea();
        drink = new MilkDecorator(drink);
        drink = new PearlDecorator(drink);
        System.out.println(drink.cost());
    }
}
