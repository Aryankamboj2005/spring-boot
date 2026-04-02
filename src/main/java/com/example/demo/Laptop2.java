package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // When multiple classes implement the same interface (like 'computer'),
         // @Primary tells Spring Boot to choose this class as the default choice.
         // This prevents the "Ambiguous Bean" error!
public class Laptop2 implements computer {
    public void compile(){
        System.out.println("Laptop2 compile");
    }
    public void debug(){
        System.out.println("Laptop2 debug");
    }
}

