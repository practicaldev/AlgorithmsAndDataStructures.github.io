package com.rameshify.designpatterns;

import com.rameshify.designpatterns.abstractfactory.Drink;
import com.rameshify.designpatterns.abstractfactory.Drinkable;

public class AbstactDrinkFactoryTest {
    public static void main(String[] args) {
        AbstractDrinkFactory drinkFactory = AbstractDrinkFactory.getFactory(Drink.COCA_COLA);
        Drinkable cocaCola = drinkFactory.getDrink();
        consume(cocaCola);
        drinkFactory = AbstractDrinkFactory.getFactory(Drink.MAAZA);
        Drinkable maaza = drinkFactory.getDrink();
        consume(maaza);
        drinkFactory = AbstractDrinkFactory.getFactory(Drink.THUMBS_UP);
        Drinkable thumbsUp = drinkFactory.getDrink();
        consume(thumbsUp);
    }

    private static void consume(Drinkable drink) {
        System.out.println("Drinking "+drink.drink()+"ml of "+drink.name());
    }
}
