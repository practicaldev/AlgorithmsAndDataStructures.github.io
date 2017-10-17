package com.rameshify.designpatterns.abstractfactory;

public class CocaCola implements Drinkable {

    @Override
    public int drink() {
        return 250;
    }

    @Override
    public String name() {
        return "Coca Cola";
    }
}
