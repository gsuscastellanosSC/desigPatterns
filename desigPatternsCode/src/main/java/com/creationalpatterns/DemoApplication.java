package com.creationalpatterns;

import com.creationalpatterns.creationalpatterns.factorymethod.Start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Start.factoryMethod("productZero", "productOne", "productTwo", "productN", "OtherIt");

    }

}
