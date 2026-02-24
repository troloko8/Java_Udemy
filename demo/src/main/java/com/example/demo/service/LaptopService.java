package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.err.println("adding Laptop");
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
    
}
