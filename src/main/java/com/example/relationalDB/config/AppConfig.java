package com.example.relationalDB.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableJpaRepositories(basePackages = "com.example.relationalDB.repositries")
@EnableTransactionManagement
public class AppConfig {
	
	@Autowired
    private Environment env;
  
    
    @Bean()
    public DataSource getDataSource() {
        DataSource dataSource = DataSourceBuilder
                .create()
                .username(env.getProperty("jdbc.username"))
                .password(env.getProperty("jdbc.password"))
                .url(env.getProperty("jdbc.url"))
                .driverClassName(env.getProperty("jpa.driverClassName"))              
                .build();
        return dataSource;
    }

}
