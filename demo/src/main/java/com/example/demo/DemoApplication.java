package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.service.LaptopService;
import com.example.demo.model.Laptop;


@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);

		service.addLaptop(lap);

		// Alien obj = context.getBean(Alien.class);
		// System.err.println(obj.getAge());
		// obj.code();
	}

}
