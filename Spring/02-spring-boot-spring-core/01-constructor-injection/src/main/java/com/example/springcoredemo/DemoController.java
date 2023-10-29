package com.example.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private fill for the dependency;
    private Coach myCoach;

    //define thats a constructor for a dependency injection
    @Autowired
    DemoController(Coach theCoach){
        this.myCoach = theCoach;
    }

    @GetMapping ("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWork();
    }
}
