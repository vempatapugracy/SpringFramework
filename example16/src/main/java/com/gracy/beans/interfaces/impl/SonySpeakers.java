package com.gracy.beans.interfaces.impl;

import com.gracy.beans.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {
    private String name="Sony";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SonySpeakers{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Sony Speaker making sound!");
    }
}
