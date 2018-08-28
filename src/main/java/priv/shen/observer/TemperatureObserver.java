package priv.shen.observer;

public class TemperatureObserver implements Observer {

    private Temperature temperature;

    public TemperatureObserver(Temperature temperature){
        this.temperature = temperature;
        temperature.registerObserver(this);
    }

    @Override
    public void update(double template) {
        System.out.println("temperature change: "+template);
    }
}
