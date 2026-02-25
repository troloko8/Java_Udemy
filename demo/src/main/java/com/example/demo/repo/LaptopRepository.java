package com.example.demo.repo;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save() {
        System.err.println("Saving in DB");
    }
}
