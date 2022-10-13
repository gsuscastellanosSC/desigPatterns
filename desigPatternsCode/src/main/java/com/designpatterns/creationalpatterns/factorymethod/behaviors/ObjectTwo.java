package com.designpatterns.creationalpatterns.factorymethod.behaviors;


public class ObjectTwo implements Behaviors {

    @Override
    public void behaviourZero() {
        System.out.println("ObjectTwo, behaviourZero");
    }

    @Override
    public void behaviourOne() {
        System.out.println("ObjectTwo, behaviourOne");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("ObjectTwo, behaviourTwo");
    }

    @Override
    public void behaviourThree() {
        System.out.println("ObjectTwo, behaviourThree");
    }

    @Override
    public void behaviourN() {
        System.out.println("ObjectTwo, behaviourN\n");
    }
}
