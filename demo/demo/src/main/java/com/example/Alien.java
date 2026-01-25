package com.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop lap;
    

    public Alien() {
        System.err.println("Object created");
    }

    @ConstructorProperties({"age", "lap"})
    public Alien(int age, Laptop lap) {
        System.err.println("Age contructor called");
        this.age = age;
        this.lap = lap;
    }
    
    public void code() {
        lap.compile();
        System.err.println("Age is " + age);
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.err.println("A age's setter is active");

        this.age = age;
    }
}
