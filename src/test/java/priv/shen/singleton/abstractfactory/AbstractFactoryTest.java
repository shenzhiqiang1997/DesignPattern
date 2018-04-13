package priv.shen.singleton.abstractfactory;

import org.junit.Test;
import priv.shen.abstractfactory.*;

public class AbstractFactoryTest {
    @Test
    public void test(){
        AbstractFactory factory1 = new ConcreteFactory1();
        // 创建具体相关产品对象A1和B1
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        AbstractFactory factory2 = new ConcreteFactory2();
        //创建具体相关产品对象A2和B2
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
    }
}
