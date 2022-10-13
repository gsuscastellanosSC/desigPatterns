package com.designpatterns;

import com.designpatterns.creationalpatterns.factorymethod.creator.StartFactoryMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatterns {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatterns.class, args);

        StartFactoryMethod.run("ObjectZero", "ObjectOne", "ObjectTwo", "ObjectN", "ObjectIt");

    }

}
