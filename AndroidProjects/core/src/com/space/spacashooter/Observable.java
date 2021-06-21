package com.space.spacashooter;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    //We're watching the shield.
    private List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyMe() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }
}
