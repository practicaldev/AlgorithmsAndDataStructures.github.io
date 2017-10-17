package com.rameshify.designpatterns.abstractfactory;

public class ThumbsUp implements Drinkable {
    @Override
    public int drink() {
        return 300;
    }

    @Override
    public String name() {
        return "Thumbs Up";
    }
}
