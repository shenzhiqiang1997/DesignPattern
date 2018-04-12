package priv.shen.factorymethod;

public class ConcreteFactory1 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
