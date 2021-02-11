package com.springBootTest.first.demo;

public class TestEditor {
    SpellChecker sc;


    public SpellChecker getSc() {
        return sc;
    }

    public void setSc(SpellChecker sc) {
        System.out.println("setting sc");
        this.sc = sc;
    }
    public void checkSpelling(){
        this.sc.checkSpell();
    }
}
