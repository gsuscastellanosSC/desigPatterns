package com.designpatterns.creationalpatterns.factorymethod.creator;

import com.designpatterns.creationalpatterns.factorymethod.behaviors.Behaviors;
import com.designpatterns.creationalpatterns.factorymethod.behaviors.ObjectTwo;

public class FactoryMethodObjectTwo extends FactoryMethod {

    @Override
    public Behaviors createObject() {
        return new ObjectTwo();
    }
}
