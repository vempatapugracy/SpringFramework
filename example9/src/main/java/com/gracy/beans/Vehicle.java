package com.gracy.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public Vehicle(){
        System.out.println("Vehicle bean created!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean!!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
