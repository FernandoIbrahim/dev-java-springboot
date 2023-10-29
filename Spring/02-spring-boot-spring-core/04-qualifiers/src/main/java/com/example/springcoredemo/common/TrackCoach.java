package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component("TrackCoach")
public class TrackCoach implements Coach{
    public String getDailyWork(){
        return "what a TrackCoach do?";
    }
}