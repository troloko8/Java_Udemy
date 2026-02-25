package com.example.demo.service;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save() {
        System.err.println("Saving in DB");
    }
}
