package com.rameshify.designpatterns.abstractfactory;

public class Maaza implements Drinkable {
    @Override
    public int drink() {
        return 300;
    }

    @Override
    public String name() {
        return "Maaza";
    }
}
