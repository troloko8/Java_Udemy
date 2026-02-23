package com.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public Laptop() {
        System.err.println("Laptop Object created");
    }

    @Override
    public void compile() {
        System.err.println("Complinig on Laptop");
    }
}
