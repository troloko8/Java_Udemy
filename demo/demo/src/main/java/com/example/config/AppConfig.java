package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.Alien;
import com.example.Desktop;
import com.example.Laptop;
import com.example.Computer;

// java based config // replace xml config
@Configuration
@ComponentScan("com.example") // in order to fill out config out @Component clasess
public class AppConfig {

    // // @Bean(name = {"desktop1", "com2", "beast"}) // for multinames
    // @Bean
    // // @Scope("prototype")
    // @Primary // in order to specify this Computer if we have ambiguity
    // public Desktop desktop() {
    //     return new Desktop();
    // }

    // @Bean
    // public Laptop laptop() {
    //     return new Laptop();
    // }

    // @Bean
    // // Autowire
    // // public Alien alien(@Autowired Computer comp) { 
    // // public Alien alien(@Qualifier("desktop") Computer comp) { //in order to assign to specfic bean
    // public Alien alien(Computer comp) { //in order to assign to specfic bean
    //     Alien obj = new Alien();
    //     obj.setAge(24);
    //     obj.setComp(comp);
    //     return obj;
    // }
}
