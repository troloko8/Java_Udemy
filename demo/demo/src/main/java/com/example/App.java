package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien1 = context.getBean("alien", Alien.class);

        alien1.code();

        // in this case no need id into bean, make a reference through className
        Desktop desk = context.getBean(Desktop.class);
    }
}
