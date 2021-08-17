package com.spring.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    //@Autowired
    //Sample sample;

    @Autowired
    SampleProperties sampleProperties;


    @Autowired
    //private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //System.out.println(sample.toString());
        System.out.println(sampleProperties.getName());
        System.out.println(sampleProperties.getSessionTimeout());
        System.out.println(sampleProperties.getSessionTimeouts());

    }
}
