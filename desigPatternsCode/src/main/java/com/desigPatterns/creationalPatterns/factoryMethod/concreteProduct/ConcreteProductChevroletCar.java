package com.desigPatterns.creationalPatterns.factoryMethod.concreteProduct;

import com.desigPatterns.creationalPatterns.factoryMethod.productCommonInterface.ProductCommonInterfaceCar;

public class ConcreteProductChevroletCar implements ProductCommonInterfaceCar {

	@Override
	public void runCar() {
		System.out.println("Car ford now it´s on");
	}

	@Override
	public void openDoors() {
		System.out.println("The doors of the ford Car now it´s open");
	}

}
