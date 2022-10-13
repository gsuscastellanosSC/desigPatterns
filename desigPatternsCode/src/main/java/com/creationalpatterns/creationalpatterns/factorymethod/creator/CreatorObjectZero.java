package com.creationalpatterns.creationalpatterns.factorymethod.creator;

import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.ObjectZero;
import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.Product;

public class CreatorObjectZero extends Creator {

    @Override
    public Product createProduct() {
        return new ObjectZero();
    }
}
