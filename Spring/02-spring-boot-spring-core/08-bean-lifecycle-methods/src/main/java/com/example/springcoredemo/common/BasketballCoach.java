package com.example.springcoredemo.common;



import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("BasketballCoach")

public class BasketballCoach implements Coach {

    public BasketballCoach(){
        System.out.println("Class created: " + getClass().getSimpleName());
    }
    public String getDailyWork(){
        return "Train shots for two hours today";
    }

    //define init method
    @PostConstruct
    public void doMyStuff(){
        System.out.println(getClass().getSimpleName() + " I start doing my Stuff");
    }
    //define destroy method
    @PreDestroy
    public void finishMyStuff(){
        System.out.println(getClass().getSimpleName() + " I finish my stuff");
    }
}
