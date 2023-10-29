package com.example.springcoredemo.common;



import org.springframework.stereotype.Component;


@Component("BasketballCoach")

public class BasketballCoach implements Coach {

    public BasketballCoach(){
        System.out.println("Class created: " + getClass().getSimpleName());
    }
    public String getDailyWork(){
        return "Train shots for two hours today";
    }

}
