package com.creationalpatterns.creationalpatterns.factorymethod.behaviors;

public class ObjectN implements Product {

    @Override
    public void behaviourZero() {
        System.out.println("behaviourZero, ObjectN");
    }

    @Override
    public void behaviourOne() {
        System.out.println("behaviourOne, ObjectN");
    }

    @Override
    public void behaviourTwo() {
        System.out.println("behaviourTwo, ObjectN");
    }

    @Override
    public void behaviourN() {
        System.out.println("behaviourN, ObjectN\n");
    }
}
