package com.designpatterns.creationalpatterns.abstractfactory.families.pair;

import com.designpatterns.creationalpatterns.abstractfactory.objects.ObjectOfTypeFour;

public class PairTypeObjectsTwo implements ObjectOfTypeFour {

    @Override
    public void nameObjectOfTypeZero() {
        System.err.println("::Objeto de tipo nameObjectOfTypeZero");
    }
}
