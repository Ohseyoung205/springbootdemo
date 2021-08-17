package com.spring.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PortLisener implements ApplicationListener<ServletWebServerInitializedEvent> {


    //외부 설정
    @Value("${sample.name}")
    private String name;

    //포트 확인
    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {

        ServletWebServerInitializedEvent serverInitializedEvent = servletWebServerInitializedEvent;
        System.out.println(serverInitializedEvent.getWebServer().getPort());
        System.out.println("name :" + name);

    }
}
