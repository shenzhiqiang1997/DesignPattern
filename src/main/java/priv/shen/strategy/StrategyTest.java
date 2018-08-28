package priv.shen.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        StrategyUser strategyUser = new StrategyUser();

        Strategy strategy1 = new ConcreteStrategy1();
        Strategy strategy2 = new ConcreteStrategy2();

        strategyUser.setStrategy(strategy1);
        strategyUser.performBehavior();

        strategyUser.setStrategy(strategy2);
        strategyUser.performBehavior();
    }
}
