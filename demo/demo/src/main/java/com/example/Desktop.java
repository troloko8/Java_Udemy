package com.example;

public class Desktop implements Computer {

    public Desktop() {
        System.err.println("Desktop Object created");
    }

    @Override
    public void compile() {
        System.err.println("Complinig on Desktop");
    }
}
