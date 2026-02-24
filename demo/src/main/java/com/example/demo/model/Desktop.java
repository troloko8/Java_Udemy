package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile() {
        System.err.println("compiling in DEsktop");
    }
}
