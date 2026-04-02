package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // use to tell the spring that you have to make the object of
           // this class so that we can easily use it.
public class Alien {
    
    @Autowired  // Autowire the object of the Laptop class from the Spring Container
    private Laptop lap;

    public String hlo() {
        lap.compile();
        lap.debug();
        return "Working on awesome project";
    }
}
