package com.spring.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class BaseConfiguration {

    @Bean
    public String hello(){
        return "test";
    }
}
