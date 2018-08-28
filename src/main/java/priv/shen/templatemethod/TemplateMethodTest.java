package priv.shen.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        ShowerTemplate concreteShower1 = new ConcreteShower1();
        ShowerTemplate concreteShower2 = new ConcreteShower2();

        concreteShower1.takeAShower();
        System.out.println();
        concreteShower2.takeAShower();
    }
}
