package com.example.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("BasketcallCoach")
@Primary
public class BaketballCoach implements Coach {

    public String getDailyWork(){
        return "Train shots for two hours today";
    }
}
