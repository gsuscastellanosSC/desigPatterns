package com.creationalpatterns.creationalpatterns.factorymethod.creator;

import com.creationalpatterns.creationalpatterns.factorymethod.behaviors.Product;

public abstract class Creator {

    abstract public Product createProduct();

    public void startCreation() {
        Product product = createProduct();
        product.behaviourZero();
        product.behaviourOne();
        product.behaviourTwo();
        product.behaviourN();
    }

}
