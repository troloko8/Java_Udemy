package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compiling();
        System.err.println("code...");
    }
}
