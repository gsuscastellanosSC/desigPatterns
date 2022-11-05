package com.designpatterns.creationalpatterns.abstractfactory.families.odd;

import com.designpatterns.creationalpatterns.abstractfactory.objects.ObjectOfTypeOne;

public class OddTypeObjectsOne implements ObjectOfTypeOne {

    @Override
    public void nameObjectOfTypeOne() {
        System.err.println("::typeObject");
    }
}
