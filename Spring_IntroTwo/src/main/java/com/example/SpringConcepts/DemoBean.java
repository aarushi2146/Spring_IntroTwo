package com.example.SpringConcepts;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    public DemoBean() {
        System.out.println("DemoBean has been initialized!");
    }

    public String getMessage() {
        return "Hello from DemoBean!";
    }
}
