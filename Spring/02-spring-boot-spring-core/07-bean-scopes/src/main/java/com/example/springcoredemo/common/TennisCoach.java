package com.example.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component("TennisCoach")
public class TennisCoach implements Coach {


    public TennisCoach(){
        System.out.println("Class created: " + getClass().getSimpleName());
    }


    public String getDailyWork(){
        return "Running for 2 hours";
    }
}
