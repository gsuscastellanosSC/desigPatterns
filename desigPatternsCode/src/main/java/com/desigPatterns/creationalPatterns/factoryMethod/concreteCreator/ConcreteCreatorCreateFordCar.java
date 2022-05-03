package com.desigPatterns.creationalPatterns.factoryMethod.concreteCreator;

import com.desigPatterns.creationalPatterns.factoryMethod.baseCreator.baseCreatorCar;
import com.desigPatterns.creationalPatterns.factoryMethod.concreteProduct.ConcreteProductFordCar;
import com.desigPatterns.creationalPatterns.factoryMethod.productCommonInterface.ProductCommonInterfaceCar;

public class ConcreteCreatorCreateFordCar extends baseCreatorCar {

	@Override
	public ProductCommonInterfaceCar createCar() {
		return new ConcreteProductFordCar();
	}

}
