package com.designpatterns.creationalpatterns.factorymethod.creator;

import com.designpatterns.creationalpatterns.factorymethod.behaviors.Behaviors;
import com.designpatterns.creationalpatterns.factorymethod.behaviors.ObjectN;

public class FactoryMethodObjectN extends FactoryMethod {

    @Override
    public Behaviors createObject() {
        return new ObjectN();
    }
}
