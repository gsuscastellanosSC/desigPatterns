package com.desigPatterns.creationalPatterns.factoryMethod.concreteProduct;

import com.desigPatterns.creationalPatterns.factoryMethod.productCommonInterface.ProductCommonInterfaceCar;

public class ConcreteProductFordCar implements ProductCommonInterfaceCar {

	@Override
	public void runCar() {
		System.out.println("Car chevrolet now it´s on");
	}

	@Override
	public void openDoors() {
		System.out.println("The doors of the chevrolet Car now it´s open");
	}

}
