package priv.shen.singleton.factorymethod;

import org.junit.Test;
import priv.shen.factorymethod.ConcreteFactory1;
import priv.shen.factorymethod.ConcreteFactory2;
import priv.shen.factorymethod.Factory;
import priv.shen.factorymethod.Product;

public class FactoryMethodTest {
    @Test
    public void test(){
        Factory factory = new ConcreteFactory1();
        Product product = factory.createProduct();

        factory = new ConcreteFactory2();
        product = factory.createProduct();
    }
}
