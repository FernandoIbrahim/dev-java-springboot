package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Lazy
@Component("BasketballCoach")
public class BasketballCoach implements Coach {

    public BasketballCoach(){
        System.out.println("BasketballCoach created");
    }
    public String getDailyWork(){
        return "Train shots for two hours today";
    }
}
