package com.BehaviourialDP.Observer.example;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject
public class Blog implements Subject {

    List<Observer> observersList;
    private boolean stateChange;

    public Blog() {
        this.observersList = new ArrayList();
        stateChange = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void notifyObserver() {
        if (stateChange) {
            for(Observer observer : observersList) {
                observer.update();
                System.out.println("Observer notified !");
            }
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public Object getUpdate() {
        Object changedState = null;
        // should have logic to send the state change to querying observer
        if (stateChange) {
            changedState = "Observer Design Pattern";
        }
        return changedState;
    }

    public void postNewArticle() {
        stateChange = true;
        notifyObserver();
    }
}