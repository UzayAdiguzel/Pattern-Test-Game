package com.space.spacashooter;

public class parent implements Observer {

    private String name;

    public parent(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {

        ObserverManager guard = (ObserverManager) observable;
        System.out.println(name + " Alarm Player Shield Level: "+ guard.getShield()+ " ! ");
    }
}
