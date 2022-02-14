package com.example.demo;

import com.example.demo.task1.Simple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Simple simple = new Simple();
        Simple simple1 = new Simple();
        System.out.println(Simple.count);
    }

}
