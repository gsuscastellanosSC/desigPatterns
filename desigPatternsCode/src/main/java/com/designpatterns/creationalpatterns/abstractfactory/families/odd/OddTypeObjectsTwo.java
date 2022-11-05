package com.designpatterns.creationalpatterns.abstractfactory.families.odd;

import com.designpatterns.creationalpatterns.abstractfactory.objects.ObjectOfTypeThree;

public class OddTypeObjectsTwo implements ObjectOfTypeThree {


    @Override
    public void nameObjectOfTypeOne() {
        System.err.println("::typeObject");
    }
}
