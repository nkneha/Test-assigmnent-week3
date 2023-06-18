package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
    @Autowired
    Car c;
    String name = "Neha Kumari";
    @GetMapping("name")
    public String getName(){

        return c.getColor();
    }

    @PutMapping("name")
    public void clearName(){
        name = "";
    }
}
