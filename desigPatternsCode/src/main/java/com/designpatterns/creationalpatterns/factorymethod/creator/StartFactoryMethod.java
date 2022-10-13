package com.designpatterns.creationalpatterns.factorymethod.creator;

import java.util.Arrays;

public class StartFactoryMethod {

    private StartFactoryMethod() {
    }

    public static void run(String... creator) {
        Arrays.stream(creator).forEach(StartFactoryMethod::validateObjectType);
    }
    private static void validateObjectType(String objectType) {
        switch (objectType) {
            case "ObjectZero" -> {
                new FactoryMethodObjectZero().startCreation();
            }
            case "ObjectOne" -> {
                new FactoryMethodObjectOne().startCreation();
            }
            case "ObjectTwo" -> {
                new FactoryMethodObjectTwo().startCreation();
            }
            case "ObjectN" -> {
                new FactoryMethodObjectN().startCreation();
            }
            default -> System.err.println("::the object does not exist");
        }
    }
}
