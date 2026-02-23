package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        // APP BASED config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Desktop dt = context.getBean(Desktop.class);
        // Desktop dt = context.getBean("desktop",Desktop.class);
        // dt.compile();
        // Desktop dt2 = context.getBean("desktop",Desktop.class);
        // dt2.compile();

        Alien alien1 = context.getBean("alien", Alien.class);

        alien1.code();

        // XML BASED CONFIG
        
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // Alien alien1 = context.getBean("alien", Alien.class);

        // alien1.code();

        // // in this case no need id into bean, make a reference through className
        // Desktop desk = context.getBean(Desktop.class);
    }
}
