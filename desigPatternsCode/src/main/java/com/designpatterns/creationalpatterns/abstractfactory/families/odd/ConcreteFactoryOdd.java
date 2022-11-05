package com.designpatterns.creationalpatterns.abstractfactory.families.odd;

public class ConcreteFactoryOdd implements OddFactory {

    public ConcreteFactoryOdd() {
        OddTypeObjectsZero algo = this.createOddTypeObjectsZero();
        OddTypeObjectsOne otra = this.createOddTypeObjectsOne();
        OddTypeObjectsTwo yAlgo = this.createOddTypeObjectsTwo();
        System.err.println("OddTypeObjectsZero " + algo + "OddTypeObjectsOne " + otra + "OddTypeObjectsTwo " + yAlgo);
    }

    @Override
    public OddTypeObjectsZero createOddTypeObjectsZero() {
        System.err.println("::Creando un nuevo objeto de tipo createOddTypeObjectsZero");
        return new OddTypeObjectsZero();
    }

    @Override
    public OddTypeObjectsOne createOddTypeObjectsOne() {
        System.err.println("::Creando un nuevo objeto de tipo createOddTypeObjectsOne");
        return new OddTypeObjectsOne();
    }

    @Override
    public OddTypeObjectsTwo createOddTypeObjectsTwo() {
        System.err.println("::Creando un nuevo objeto de tipo createOddTypeObjectsTwo");
        return new OddTypeObjectsTwo();
    }
}
