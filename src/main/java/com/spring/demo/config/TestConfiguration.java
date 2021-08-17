package com.spring.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
@Configuration
public class TestConfiguration {

    @Bean
    public String hello(){
        return "hello";
    }
}
