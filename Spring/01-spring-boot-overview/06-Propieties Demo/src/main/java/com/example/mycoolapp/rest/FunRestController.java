package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {

    @Value("${coach.name}")
    public String coachName;

    @Value("${team.name}")
    public String teamName;

    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "Say Hello to the coach " + coachName + "and his team " + teamName;
    }


    //expose "/" that returns a hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello, World!";
    }

    //expose new endpoint for "workout"
    @GetMapping("/worksout")
    public String getDailyWorkOut(){
        return "Run a hard 5k!";
    }

    //expose new endpoint for "workout"
    @GetMapping("/works")
    public String getDailyWork(){
        return "Run a hard 777k!";
    }

}
