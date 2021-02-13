package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    //METHOD NAME WILL BE BEAMid
    @Bean
    public FortuneService sadFortune(){
        return new SadFortune();
    }

    @Bean
    public Coach swim(){
        return new swimCoach(sadFortune());
    }
	
}
