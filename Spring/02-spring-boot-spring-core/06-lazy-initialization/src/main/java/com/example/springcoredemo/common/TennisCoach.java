package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component("TennisCoach")
public class TennisCoach implements Coach {


    public TennisCoach(){
        System.out.println("TennisCoach created");
    }


    public String getDailyWork(){
        return "Running for 2 hours";
    }
}
