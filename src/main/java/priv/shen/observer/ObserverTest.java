package priv.shen.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(32);
        for (int i = 0; i < 10; i++) {
            TemperatureObserver to= new TemperatureObserver(temperature);
        }
        temperature.setTemp(24);
    }
}
