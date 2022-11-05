package com.designpatterns.creationalpatterns.abstractfactory.families.odd;

import com.designpatterns.creationalpatterns.abstractfactory.objects.ObjectOfTypeZero;

public class OddTypeObjectsZero implements ObjectOfTypeZero {

    @Override
    public void nameObjectOfTypeZero() {
        System.err.println("::typeObject");
    }
}
