package com.rameshify.designpatterns.abstractfactory;

import com.rameshify.designpatterns.AbstractDrinkFactory;

public class MaazaFactory extends AbstractDrinkFactory {
    @Override
    public Drinkable getDrink() {
        return new Maaza();
    }
}
