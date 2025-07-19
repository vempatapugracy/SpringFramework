package com.gracy.config;

import com.gracy.beans.Person;
import com.gracy.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.gracy.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle3(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

}
