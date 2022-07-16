package com.example.dewniassignment1;
/**
 * test1
 * @author DewniS
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DewniAssignment1Application {

    public static void main(String[] args) {
        SpringApplication.run(DewniAssignment1Application.class, args);
    }
    /**
     * DewniS
     * testing javadoc
     * @author DewniS
     */
    @GetMapping("/hello-world/welcome")
    public String helloWorld(){
        return "Welcome to LOLC";
    }
}
