package com.BehaviourialDP.Observer.example;

public interface Subject {

    public void registerObserver(Observer observer);
    public void notifyObserver();
    public void unregisterObserver(Observer observer);
    public Object getUpdate();
}
