package com.example.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component("TrackCoach")
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("Class created: " + getClass().getSimpleName());
    }

    public String getDailyWork(){
        return "what a TrackCoach do?";
    }

}