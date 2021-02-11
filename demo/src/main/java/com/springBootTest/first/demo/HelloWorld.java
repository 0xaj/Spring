package com.springBootTest.first.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class HelloWorld {
    String message;

    public void getMessage() {
        System.out.println("your message: "+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");

    }
}
