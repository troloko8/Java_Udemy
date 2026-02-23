package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // instead of creating the @Bean in appConfig file
@Primary
public class Desktop implements Computer {

    public Desktop() {
        System.err.println("Desktop Object created");
    }

    @Override
    public void compile() {
        System.err.println("Complinig on Desktop");
    }
}
