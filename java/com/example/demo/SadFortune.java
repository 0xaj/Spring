package com.example.demo;

public class SadFortune implements FortuneService{

    @Override
    public String getFortune() {
            return "Not a lucky day!";
    }
}
