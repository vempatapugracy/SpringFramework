package com.gracy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name ="Lucy";
//    @Autowired
//    @Qualifier("vehicle2")
    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle3") Vehicle vehicle1){
        System.out.println("Person bean created!");
        this.vehicle=vehicle1;
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

//    @Autowired
    public void setVehicle(/*@Qualifier("vehicle2")*/Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
