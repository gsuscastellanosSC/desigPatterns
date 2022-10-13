package com.creationalpatterns.creationalpatterns.factorymethod.behaviors;


public class ObjectTwo implements Product {

    @Override
    public void behaviourZero() {
        System.out.println("behaviourZero, ObjectTwo");
    }

    @Override
    public void behaviourOne() {
        System.out.println("behaviourOne, ObjectTwo");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("behaviourTwo, ObjectTwo");
    }

    @Override
    public void behaviourN() {
        System.out.println("behaviourN, ObjectTwo\n");
    }
}
