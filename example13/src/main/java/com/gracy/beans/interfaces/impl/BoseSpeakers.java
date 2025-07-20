package com.gracy.beans.interfaces.impl;

import com.gracy.beans.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speakers {
    private String name="Bose";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BoseSpeakers{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void makeSound(){
        System.out.println("Bose Speakers making sound!");
    }
}
