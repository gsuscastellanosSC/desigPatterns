package com.desigPatterns.creationalPatterns.factoryMethod.baseCreator;

import com.desigPatterns.creationalPatterns.factoryMethod.productCommonInterface.ProductCommonInterfaceCar;

public abstract class baseCreatorCar {

	public baseCreatorCar() {
		@SuppressWarnings("unused")
		ProductCommonInterfaceCar productCommonInterfaceCar = createCar();
	}

	public abstract ProductCommonInterfaceCar createCar();
}
