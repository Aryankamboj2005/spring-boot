package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        // Initializing Spring Boot Application Context
        ApplicationContext context = SpringApplication.run(App.class, args);
        
        // Fetching Alien bean (assuming it is now annotated with @Component)
        Alien obj = context.getBean(Alien.class); 
        System.out.println(obj.hlo());

        // Implementing Login Logic Demonstration
        LoginService loginService = context.getBean(LoginService.class);
        
        // Case 1: Correct Credentials
        loginService.authenticate("admin", "password123");
        
        // Case 2: Incorrect Credentials
        loginService.authenticate("user", "wrong_pass");
    }
}
