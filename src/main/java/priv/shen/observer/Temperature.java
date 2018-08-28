package priv.shen.observer;

import java.util.ArrayList;
import java.util.List;

public class Temperature implements Subject{
    private double temp;
    private List<Observer> observers = new ArrayList<>();

    public Temperature(double temp){
        this.temp = temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:
             observers) {
            observer.update(temp);
        }
    }
}
