package com.designpatterns.creationalpatterns.factorymethod.creator;

import com.designpatterns.creationalpatterns.factorymethod.behaviors.Behaviors;
import com.designpatterns.creationalpatterns.factorymethod.behaviors.ObjectZero;

public class FactoryMethodObjectZero extends FactoryMethod {

    @Override
    public Behaviors createObject() {
        return new ObjectZero();
    }
}
