package com.spring.demo.config;

import com.spring.demo.SampleProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//외부주입2
//프로퍼티 작성 후에 빈등록을 해야함

@Configuration
@EnableConfigurationProperties(SampleProperties.class) //프로퍼티스 주입
public class SmapleConfiguration {

   /* @Bean
    @ConditionalOnMissingBean // 빈의 우선시 적용
    public Sample holoman (SampleProperties properties){
        Sample sample = new Sample();
        sample.setHowLong(properties.getHowLong());
        sample.setName(properties.getName());
        return sample;
    }*/
}
