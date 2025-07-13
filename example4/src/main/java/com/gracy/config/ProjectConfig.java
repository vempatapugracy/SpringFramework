package com.gracy.config;

import com.gracy.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="audiVehicle")
    Vehicle veh1(){
        Vehicle vehicle =new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }
    @Bean(value="hondaVehicle")
    Vehicle veh2(){
        Vehicle vehicle =new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }
    @Primary
    @Bean("ferrariVehicle")
    Vehicle veh3(){
        Vehicle vehicle =new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

}
