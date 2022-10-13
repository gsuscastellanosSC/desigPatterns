package com.creationalpatterns.creationalpatterns.factorymethod.behaviors;

public class ObjectOne implements Product {

    @Override
    public void behaviourZero() {
        System.out.println("behaviourZero, ObjectOne");
    }

    @Override
    public void behaviourOne() {
        System.out.println("behaviourOne, ObjectOne");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("behaviourTwo, ObjectOne");
    }

    @Override
    public void behaviourN() {
        System.out.println("behaviourN, ObjectOne\n");
    }
}
