package com.designpatterns.creationalpatterns.factorymethod.behaviors;

public class ObjectOne implements Behaviors {

    @Override
    public void behaviourZero() {
        System.out.println("ObjectOne, behaviourZero");
    }

    @Override
    public void behaviourOne() {
        System.out.println("ObjectOne, behaviourOne");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("ObjectOne ,behaviourTwo");
    }

    @Override
    public void behaviourThree() {
        System.out.println("ObjectOne, behaviourThree");
    }

    @Override
    public void behaviourN() {
        System.out.println("ObjectOne, behaviourN\n");
    }
}
