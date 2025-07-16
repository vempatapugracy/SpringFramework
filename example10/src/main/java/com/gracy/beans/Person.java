package com.gracy.beans;

public class Person {

    private String name;
    private Vehicle vehicle;

    public Person(){
        System.out.println("Person bean created!");
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
