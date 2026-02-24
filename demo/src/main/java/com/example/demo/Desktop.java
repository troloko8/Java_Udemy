package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile() {
        System.err.println("compiling in DEsktop");
    }
}
