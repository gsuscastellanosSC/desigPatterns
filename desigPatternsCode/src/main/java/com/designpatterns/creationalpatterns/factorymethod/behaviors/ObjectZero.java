package com.designpatterns.creationalpatterns.factorymethod.behaviors;

public class ObjectZero implements Behaviors {

    @Override
    public void behaviourZero() {
        System.out.println("ObjectZero, behaviourZero");
    }

    @Override
    public void behaviourOne() {
        System.out.println("ObjectZero, behaviourOne");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("ObjectZero, behaviourTwo");
    }

    @Override
    public void behaviourThree() {
        System.out.println("ObjectZero, behaviourThree");
    }

    @Override
    public void behaviourN() {
        System.out.println("ObjectZero, behaviourN\n");
    }
}
