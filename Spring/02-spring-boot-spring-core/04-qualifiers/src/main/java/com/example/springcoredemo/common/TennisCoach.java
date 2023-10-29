package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component("TennisCoach")
public class TennisCoach implements Coach {
    public String getDailyWork(){
        return "Running for 2 hours";
    }
}
