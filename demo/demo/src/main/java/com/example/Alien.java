package com.example;

public class Alien {

    Integer age;

    public Alien() {
        System.err.println("Object created");
    }
    
    public void code() {
        System.err.println("Age is " + age);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.err.println("A age's setter is active");

        this.age = age;
    }
}
