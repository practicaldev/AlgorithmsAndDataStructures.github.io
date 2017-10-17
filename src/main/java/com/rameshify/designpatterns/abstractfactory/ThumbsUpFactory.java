package com.rameshify.designpatterns.abstractfactory;

import com.rameshify.designpatterns.AbstractDrinkFactory;

public class ThumbsUpFactory extends AbstractDrinkFactory {

    @Override
    public Drinkable getDrink() {
        return new ThumbsUp();
    }
}
