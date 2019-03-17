package com.example.relationalDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = { "file:src/config/application.properties",
        "file:config/application.properties" }, ignoreResourceNotFound = true)
public class RelationalDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(RelationalDbApplication.class, args);
    }
}
