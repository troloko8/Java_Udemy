package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien1 = (Alien) context.getBean("alien");
        alien1.age = 12;
        alien1.code();
        Alien alien2 = (Alien) context.getBean("alien");

        alien2.code();


    }
}
