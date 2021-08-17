package com.spring.demo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.time.temporal.ChronoUnit;


//외부주입 2
@Component
@ConfigurationProperties("sample")
@Validated //검증
public class SampleProperties {

    @NotEmpty //validate 검증용
    @NotNull

    String name;
    int howLong;

    //시간 설정
    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTimeout = Duration.ofSeconds(30);

    private Duration sessionTimeouts= Duration.ofSeconds(30);

    public Duration getSessionTimeouts() {
        return sessionTimeouts;
    }

    public void setSessionTimeouts(Duration sessionTimeouts) {
        this.sessionTimeouts = sessionTimeouts;
    }

    public Duration getSessionTimeout() {

        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {

        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }
}
