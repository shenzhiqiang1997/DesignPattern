package priv.shen.templatemethod;

public class ConcreteShower1 extends ShowerTemplate {
    @Override
    protected void behavior() {
        System.out.println("shampoo");
        System.out.println("rub the back");
        System.out.println("clean face");
    }
}
