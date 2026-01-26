package com.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer comp;
    

    public Alien() {
        // System.err.println("Object created");
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
