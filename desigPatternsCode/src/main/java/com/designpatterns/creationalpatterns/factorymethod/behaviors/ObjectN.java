package com.designpatterns.creationalpatterns.factorymethod.behaviors;

public class ObjectN implements Behaviors {

    @Override
    public void behaviourZero() {
        System.out.println("ObjectN, behaviourZero");
    }

    @Override
    public void behaviourOne() {
        System.out.println("ObjectN, behaviourOne");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("ObjectN, behaviourTwo");
    }

    @Override
    public void behaviourThree() {
        System.out.println("ObjectN, behaviourThree");
    }

    @Override
    public void behaviourN() {
        System.out.println("ObjectN, behaviourN\n");
    }
}
