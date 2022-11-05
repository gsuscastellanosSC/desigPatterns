package com.designpatterns.creationalpatterns.abstractfactory.families.pair;

import com.designpatterns.creationalpatterns.abstractfactory.objects.ObjectOfTypeZero;

public class PairTypeObjectsZero implements ObjectOfTypeZero {

    @Override
    public void nameObjectOfTypeZero() {
        System.err.println("::Objeto de tipo PairTypeObjectsZero");
    }
}
