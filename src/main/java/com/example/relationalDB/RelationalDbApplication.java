package com.example.relationalDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
//@PropertySources({
//	@PropertySource(ignoreResourceNotFound = true, value = "file:/src/main/config/application.properties"),
//	@PropertySource(ignoreResourceNotFound = true, value = "file:config/application.properties")
//	})
public class RelationalDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(RelationalDbApplication.class, args);
    }
}
