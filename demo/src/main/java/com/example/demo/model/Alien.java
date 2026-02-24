package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Alien {

    private Computer comp;
    @Value("25")
    private int age;

    public void code() {
        comp.compile();
        System.err.println("code...");
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
    @Qualifier("desktop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
