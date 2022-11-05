package com.designpatterns.creationalpatterns.abstractfactory.families.pair;

import com.designpatterns.creationalpatterns.abstractfactory.objects.ObjectOfTypeTwo;

public class PairTypeObjectsOne implements ObjectOfTypeTwo {

    @Override
    public void nameObjectOfTypeZero() {
        System.err.println("::Objeto de tipo PairTypeObjectsZero");
    }
}
