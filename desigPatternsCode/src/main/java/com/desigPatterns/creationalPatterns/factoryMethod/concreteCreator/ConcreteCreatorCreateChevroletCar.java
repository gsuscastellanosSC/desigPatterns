package com.desigPatterns.creationalPatterns.factoryMethod.concreteCreator;

import com.desigPatterns.creationalPatterns.factoryMethod.baseCreator.baseCreatorCar;
import com.desigPatterns.creationalPatterns.factoryMethod.concreteProduct.ConcreteProductChevroletCar;
import com.desigPatterns.creationalPatterns.factoryMethod.productCommonInterface.ProductCommonInterfaceCar;

public class ConcreteCreatorCreateChevroletCar extends baseCreatorCar {

	@Override
	public ProductCommonInterfaceCar createCar() {
		return new ConcreteProductChevroletCar();
	}

}
