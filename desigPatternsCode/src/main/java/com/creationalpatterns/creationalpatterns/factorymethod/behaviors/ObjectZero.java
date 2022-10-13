package com.creationalpatterns.creationalpatterns.factorymethod.behaviors;

public class ObjectZero implements Product {

    @Override
    public void behaviourZero() {
        System.out.println("behaviourZero, ObjectZero");
    }

    @Override
    public void behaviourOne() {
        System.out.println("behaviourOne, ObjectZero");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("behaviourTwo, ObjectZero");
    }

    @Override
    public void behaviourN() {
        System.out.println("behaviourN, ObjectZero\n");
    }
}
