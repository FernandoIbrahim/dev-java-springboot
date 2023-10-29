package com.example.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springcoredemo.common.Coach;
import com.example.springcoredemo.common.SwinCoach;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach myCoach(){
        return new SwinCoach();
    }
}
