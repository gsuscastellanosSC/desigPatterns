package com.creationalpatterns.creationalpatterns.factorymethod;

import com.creationalpatterns.creationalpatterns.factorymethod.creator.CreatorObjectN;
import com.creationalpatterns.creationalpatterns.factorymethod.creator.CreatorObjectOne;
import com.creationalpatterns.creationalpatterns.factorymethod.creator.CreatorObjectTwo;
import com.creationalpatterns.creationalpatterns.factorymethod.creator.CreatorObjectZero;
import java.util.Arrays;

public class Start {

    private Start() {
    }

    public static void factoryMethod(String... creator) {
        Arrays.stream(creator).forEach(Start::validateObjectType);
    }

    private static void validateObjectType(String objectType) {
        switch (objectType) {
            case "productZero" -> {
                new CreatorObjectZero().startCreation();
            }
            case "productOne" -> {
                new CreatorObjectOne().startCreation();
            }
            case "productTwo" -> {
                new CreatorObjectTwo().startCreation();

            }
            case "productN" -> {
                new CreatorObjectN().startCreation();
            }
            default -> System.err.println("::the object does not exist");
        }
    }
}
