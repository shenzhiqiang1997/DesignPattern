package priv.shen.strategy;

public class StrategyUser {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void performBehavior(){
        if (strategy!=null)
            strategy.behavior();
    }
}
