package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien");
        System.out.println("Alien 1 Age: " + obj1.getAge());

        Alien obj2 = (Alien) context.getBean("alien2");
        System.out.println("Alien 2 Age: " + obj2.getAge());

        System.out.println("Hello World!");
    }
}
