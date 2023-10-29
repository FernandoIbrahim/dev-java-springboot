package com.example.springcoredemo.common;



public class SwinCoach implements Coach{

    public SwinCoach(){
        System.out.println(getClass().getSimpleName()+": in the constructor");
    }
    public String getDailyWork(){
        return "swin on the river";
    }
}
