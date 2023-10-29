package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component("TrackCoach")
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("TrackCoach created");
    }

    public String getDailyWork(){
        return "what a TrackCoach do?";
    }

}