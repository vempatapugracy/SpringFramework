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
    public Vehicle vehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Toyoto");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("lucy");
        person.setVehicle(vehicle);
        return person;
    }
}
