package com.github.gntodtndls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ExecutePythonApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(ExecutePythonApplication.class, args);
        Process process = Runtime.getRuntime().exec("python3 src/script/script.py");
        int exitCode = process.waitFor();

        if (exitCode == 0) {
            String print = new String(process.getInputStream().readAllBytes());
            System.out.println(print);
        } else {
            String error = new String(process.getErrorStream().readAllBytes());
            System.out.println(error);
        }
        // getInputStream to String
    }
}
