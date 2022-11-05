package com.designpatterns.creationalpatterns.abstractfactory.families.odd;

public interface OddFactory {

    public OddTypeObjectsZero createOddTypeObjectsZero();

    public OddTypeObjectsOne createOddTypeObjectsOne();

    public OddTypeObjectsTwo createOddTypeObjectsTwo();
}
