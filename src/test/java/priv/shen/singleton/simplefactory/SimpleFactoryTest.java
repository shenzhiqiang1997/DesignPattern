package priv.shen.singleton.simplefactory;

import org.junit.Test;
import priv.shen.simplefactory.Product;
import priv.shen.simplefactory.SimpleFactory;

public class SimpleFactoryTest {
    @Test
    public void test(){
        SimpleFactory simpleFactory=new SimpleFactory();
        Product product=simpleFactory.createProduct(1);
    }
}
