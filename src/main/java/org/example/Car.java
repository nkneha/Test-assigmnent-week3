package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car() { //checking that object is created or not

        System.out.println("constuctor is called and object is created");
    }

    private String color = "red";
    public String getColor() {
        return color;
    }
}
