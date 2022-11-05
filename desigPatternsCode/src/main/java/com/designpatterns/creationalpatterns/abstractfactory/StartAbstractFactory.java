package com.designpatterns.creationalpatterns.abstractfactory;

import com.designpatterns.creationalpatterns.abstractfactory.families.odd.ConcreteFactoryOdd;
import com.designpatterns.creationalpatterns.abstractfactory.families.pair.ConcreteFactoryPair;
import java.util.Arrays;

public class StartAbstractFactory {

    private StartAbstractFactory() {
    }

    public static void run(String... creator) {
        Arrays.stream(creator).forEach(StartAbstractFactory::validateFactoryType);
    }

    public static void validateFactoryType(String objectType) {

        switch (objectType) {
            case "odd" -> {
                new ConcreteFactoryOdd();
            }
            case "pair" -> {
                new ConcreteFactoryPair();
            }
            default -> System.err.println("::the object does not exist");
        }
    }

}
