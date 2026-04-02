package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Tells Spring to manage the lifecycle of this class
public class Alien {
    
    // You MUST declare the field here so the whole class can use it
    private Laptop lap;

    // This is Constructor Injection
    // @Autowired // In modern Spring/Spring Boot, this is OPTIONAL if you only have one constructor
    public Alien(Laptop lap) { 
        System.out.println("Alien Object Created via Constructor Injection!");
        this.lap = lap;
    }

    public String hlo() {
        // Now 'lap' will work because it was initialized in the constructor
        lap.compile();
        lap.debug();
        return "Working on awesome project";
    }
}
