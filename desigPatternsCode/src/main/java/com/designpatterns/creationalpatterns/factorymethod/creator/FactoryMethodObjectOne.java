package com.designpatterns.creationalpatterns.factorymethod.creator;

import com.designpatterns.creationalpatterns.factorymethod.behaviors.Behaviors;
import com.designpatterns.creationalpatterns.factorymethod.behaviors.ObjectOne;

public class FactoryMethodObjectOne extends FactoryMethod {

    @Override
    public Behaviors createObject() {
        return new ObjectOne();
    }
}
