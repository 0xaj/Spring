package com.example.demo;

public class swimCoach implements Coach{

    FortuneService fs;

    public swimCoach(FortuneService tfs){
        fs = tfs;
    }
    @Override
    public String getDailyWorkout() {
        return "Swimming";
    }



    @Override
    public String getDailyFortune() {
        return fs.getFortune();
    }
}
