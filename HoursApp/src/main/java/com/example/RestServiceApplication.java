package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projectInfo.ProjectContentController;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestServiceApplication.class, args);
    }

}