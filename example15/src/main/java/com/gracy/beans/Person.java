package com.gracy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {

    private String name="Maya";
    private Vehicle vehicle;

    @Autowired
    public  Person(Vehicle vehicle) {
        this.vehicle=vehicle;
        System.out.println("**Person bean created!**");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
