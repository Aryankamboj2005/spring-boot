package com.example.demo;

import org.springframework.stereotype.Component;

@Component // object created for the Laptop class
public class Laptop {
    public void compile(){
        System.out.println("Laptop compile");
    }
    public void debug(){
        System.out.println("Laptop debug");
    }
}
