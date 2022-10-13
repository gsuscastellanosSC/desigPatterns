package com.creationalpatterns.creationalpatterns.factorymethod.creator;

import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.ObjectOne;
import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.Product;

public class CreatorObjectOne extends Creator {

    @Override
    public Product createProduct() {
        return new ObjectOne();
    }
}
