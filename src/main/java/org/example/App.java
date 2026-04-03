package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        // object of only that class will be created written in the Spring.xml

        // container is ready to make the class object dynamically . this spring.xml is
        // file we have to create
        // for the proper working of the spring
        Alien obj = (Alien) context.getBean("alien2"); // making the object of the class
        // we have give the id as alien in the spring.xml file so we need not
        // to give the Alien.class inside the parenthesis and this will return the
        // object
        // so i type cast with the Alien class

        System.out.println("Hello World!");
        // obj.setAge(18); // assigning the age value
        System.out.println(obj.getAge()); // callig the age from the Alien class

        // Alien alien= new Alien();
        // System.out.println(alien.hlo()); // getting the output
        // System.out.println(obj.hlo());
    }
}
