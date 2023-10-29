package com.example.springcoredemo.common;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("BasketballCoach")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasketballCoach implements Coach {

    public BasketballCoach(){
        System.out.println("Class created: " + getClass().getSimpleName());
    }
    public String getDailyWork(){
        return "Train shots for two hours today";
    }
}
