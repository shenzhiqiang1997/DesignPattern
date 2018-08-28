package priv.shen.templatemethod;

public class ConcreteShower2 extends ShowerTemplate{
    @Override
    protected void behavior() {
        System.out.println("rub the back");
        System.out.println("clean face");
        System.out.println("shampoo");
    }
}
