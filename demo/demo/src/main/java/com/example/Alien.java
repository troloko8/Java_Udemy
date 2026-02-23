package com.example;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21") // to set up value using value injection 
    private int age;
    // @Autowired // to connect with class if we have just one such class
    // @Qualifier("desktop")
    // also help @Primary
    private Computer comp;
    

    public Alien() {
        System.err.println("Alien Object created");
    }

    // @ConstructorProperties({"age", "comp"})
    // public Alien(int age, Computer comp) {
    //     System.err.println("Age contructor called");
    //     this.age = age;
    //     this.comp = comp;
    // }
    
    public void code() {
        comp.compile();
    }

    public Computer getcomp() {
        return comp;
    }

    @Autowired // also can do here not good practice
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.err.println("A age's setter is active");

        this.age = age;
    }
}
