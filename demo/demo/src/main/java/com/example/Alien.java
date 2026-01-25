package com.example;

public class Alien {

    private Integer age;
    private Laptop lap;
    

    public Alien() {
        System.err.println("Object created");
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
