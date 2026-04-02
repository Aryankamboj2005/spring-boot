package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Tells Spring to manage the lifecycle of this class
public class Alien {
    
    // You MUST declare the field here so the whole class can use it
    @Autowired
    @Qualifier("laptop") // use the class name but all letter are in small letter
                     // tolds the spring boot you have use the instance of which
                       // which class


    private computer comp; // as laptop is also the type of computer as laptop
                          // implements the computer


    // This is Constructor Injection
    // @Autowired // In modern Spring/Spring Boot, this is OPTIONAL if you only have one constructor
//    public Alien(Laptop lap) {
//        System.out.println("Alien Object Created via Constructor Injection!");
//        this.lap = lap;
//    }


    // setter injection
//    @Autowired
//    public void  UseLaptop(Laptop lap) {
//        this.lap=lap;
//    }

    public String hlo() {
        // Now 'lap' will work because it was initialized in the constructor
        comp.compile();
        comp.debug();
        return "Working on awesome project";
    }
}
