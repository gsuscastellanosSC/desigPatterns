package com.creationalpatterns.creationalpatterns.factorymethod.creator;

import com.creationalpatterns.creationalpatterns.factorymethod.creator.Creator;
import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.Product;
import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.ObjectN;

public class CreatorObjectN extends Creator {

    @Override
    public Product createProduct() {
        return new ObjectN();
    }
}
