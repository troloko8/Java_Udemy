package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Desktop;

// java based config // replace xml config
@Configuration
public class AppConfig {

    // @Bean(name = {"desktop1", "com2", "beast"}) // for multinames
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
    
}
