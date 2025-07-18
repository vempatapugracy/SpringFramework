package com.gracy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name ="Lucy";
    //@Autowired(required = false)
    private Vehicle vehicle;

    @Autowired //optional mentioning from 4.3 v
    public Person(Vehicle vehicle){
        System.out.println("Person bean created!");
        this.vehicle=vehicle;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //@Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
