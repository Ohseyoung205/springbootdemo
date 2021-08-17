package com.spring.demo;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


    //https로 서비스 실행시 http 통신 가능하게 설정
    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
        return tomcat;
    }

    //70포트로 http 통신 받을 수 있음
    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(70);
        return connector;
    }

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);

        //ApplicationStartingEvent Listeners 등록
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new SampleListener());
        app.run(args);

        //빠르게 띄울때 사용 (웹모드 끄고 적용시)
        //SpringApplication app = new SpringApplication(Application.class);
        //app.setWebApplicationType(WebApplicationType.NONE);
        //app.run(args);
    }
}
