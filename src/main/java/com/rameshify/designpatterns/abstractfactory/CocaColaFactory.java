package com.rameshify.designpatterns.abstractfactory;

import com.rameshify.designpatterns.AbstractDrinkFactory;

public class CocaColaFactory extends AbstractDrinkFactory {

    @Override
    public Drinkable getDrink() {
        return new CocaCola();
    }
}
