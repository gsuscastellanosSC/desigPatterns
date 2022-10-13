package com.designpatterns.creationalpatterns.factorymethod.creator;

import com.designpatterns.creationalpatterns.factorymethod.behaviors.Behaviors;

public abstract class FactoryMethod {

    abstract public Behaviors createObject();

    public void startCreation() {
        Behaviors object = createObject();
        object.behaviourZero();
        object.behaviourOne();
        object.behaviourTwo();
        object.behaviourThree();
        object.behaviourN();
    }

}
