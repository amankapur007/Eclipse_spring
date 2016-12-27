package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sample.controller.PersonController;




@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.sample.controller", "com.sample.service","com.sample.dao"})
public class DemoApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        System.out.println("Inside:;"+args);
        SpringApplication.run(DemoApplication.class, args);
    }
    /**
     * Used when run as WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }

}
