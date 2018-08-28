package priv.shen.templatemethod;

public abstract class ShowerTemplate {
    public void takeAShower(){
        turnOn();
        behavior();
        turnOff();
    }

    protected abstract void behavior();

    void turnOn(){
        System.out.println("turn on the shower");
    }

    void turnOff(){
        System.out.println("turn off the shower");
    }
}
