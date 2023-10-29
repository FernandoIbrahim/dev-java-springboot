package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component("CriketCoach")
public class CricketCoach implements Coach{

    @Override
    public String getDailyWork(){
        return "practice flast blowing for 15 minutes!!!";
    }
}