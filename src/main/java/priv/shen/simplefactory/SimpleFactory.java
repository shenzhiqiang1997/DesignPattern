package priv.shen.simplefactory;

public class SimpleFactory {
    public Product createProduct(int type){
        if (type == 1)
            return new ConcreteProduct1();
        if (type == 2)
            return new ConcreteProduct2();

        return new ConcreteProduct();
    }
}
