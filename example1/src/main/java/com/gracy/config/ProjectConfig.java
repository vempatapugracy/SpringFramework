package com.gracy.config;

import com.gracy.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle veh(){
        Vehicle vehicle =new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }

    @Bean
    String hello(){
        return "Hello Namaskar!";
    }

    @Bean
    Integer num(){
        return 100;
    }
}
