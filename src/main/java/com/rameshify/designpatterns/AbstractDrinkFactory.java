package com.rameshify.designpatterns;

import com.rameshify.designpatterns.abstractfactory.*;

public abstract class AbstractDrinkFactory {
    private static final CocaColaFactory COCA_COLA_FACTORY = new CocaColaFactory();
    private static final ThumbsUpFactory THUMBS_UP_FACTORY = new ThumbsUpFactory();
    private static final MaazaFactory MAAZA_FACTORY = new MaazaFactory();

    static AbstractDrinkFactory getFactory(Drink drink){
        AbstractDrinkFactory factory = null;
        switch (drink){
            case COCA_COLA:
                factory = COCA_COLA_FACTORY;
                break;
            case MAAZA:
                factory = MAAZA_FACTORY;
                break;
            case THUMBS_UP:
                factory = THUMBS_UP_FACTORY;
                break;
        }
        return factory;
    }

    public abstract Drinkable getDrink();
}
