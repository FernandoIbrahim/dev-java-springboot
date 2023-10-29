package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component("CriketCoach")
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("CricketCoach created");
    }

    @Override
    public String getDailyWork(){
        return "practice flast blowing for 15 minutes!!!";
    }
}