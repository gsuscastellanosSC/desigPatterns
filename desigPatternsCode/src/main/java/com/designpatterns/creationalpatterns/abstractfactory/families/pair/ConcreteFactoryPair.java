package com.designpatterns.creationalpatterns.abstractfactory.families.pair;

public class ConcreteFactoryPair implements PairFactory {

    public ConcreteFactoryPair() {
        this.createPairTypeObjectsZero();
        this.createPairTypeObjectsOne();
        this.createPairTypeObjectsTwo();
    }

    @Override
    public PairTypeObjectsZero createPairTypeObjectsZero() {
        System.err.println("::Creando un nuevo objeto de tipo PairTypeObjectsZero");
        return new PairTypeObjectsZero();
    }

    @Override
    public PairTypeObjectsOne createPairTypeObjectsOne() {
        System.err.println("::Creando un nuevo objeto de tipo createPairTypeObjectsOne");
        return new PairTypeObjectsOne();
    }

    @Override
    public PairTypeObjectsTwo createPairTypeObjectsTwo() {
        System.err.println("::Creando un nuevo objeto de tipo createPairTypeObjectsTwo");
        return new PairTypeObjectsTwo();
    }
}
