package org.example;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean authenticate(String username, String password) {
        // Simple mock authentication logic
        if ("admin".equals(username) && "password123".equals(password)) {
            System.out.println("Login Success: Welcome " + username);
            return true;
        } else {
            System.out.println("Login Failed: Invalid credentials");
            return false;
        }
    }
}
