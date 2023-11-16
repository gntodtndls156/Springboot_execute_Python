package com.github.gntodtndls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ExecutePythonApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ExecutePythonApplication.class, args);
        Process process = Runtime.getRuntime().exec("pwd");

        // getInputStream to String
        String print = new String(process.getInputStream().readAllBytes());
        System.out.println(print);
    }

}
