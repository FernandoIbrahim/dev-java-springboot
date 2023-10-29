package com.example.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcoredemo.common.Coach;

@RestController
public class DemoController {
    //define a private fill for the dependency;
    private Coach myCoach;

    //define thats a constructor for a dependency injection
    @Autowired
    public void setMyCoach( Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWork();
    }
}
