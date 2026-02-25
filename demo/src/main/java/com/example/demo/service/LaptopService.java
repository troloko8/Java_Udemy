package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.err.println("adding Laptop");
        this.repo.save();
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
    
}
