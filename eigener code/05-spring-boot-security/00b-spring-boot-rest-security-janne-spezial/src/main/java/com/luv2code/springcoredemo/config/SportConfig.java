package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.SwimCoach;
import com.luv2code.springcoredemo.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoachMethod(){
        return new SwimCoach();
    }
}
