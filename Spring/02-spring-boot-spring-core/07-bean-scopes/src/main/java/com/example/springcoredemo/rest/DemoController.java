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

    private Coach anotherCoach;

    //define thats a constructor for a dependency injection
    @Autowired
    public void setMyCoach(
        @Qualifier("BasketballCoach") Coach myCoach, 
        @Qualifier("BasketballCoach") Coach anotherCoach ) {

        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;

    }

    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWork();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: " + (myCoach == anotherCoach);   
    }
}
