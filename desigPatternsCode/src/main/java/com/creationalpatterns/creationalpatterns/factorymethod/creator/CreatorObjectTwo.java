package com.creationalpatterns.creationalpatterns.factorymethod.creator;

import com.creationalpatterns.creationalpatterns.factorymethod.creator.Creator;
import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.Product;
import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.ObjectTwo;

public class CreatorObjectTwo extends Creator {

    @Override
    public Product createProduct() {
        return new ObjectTwo();
    }
}
