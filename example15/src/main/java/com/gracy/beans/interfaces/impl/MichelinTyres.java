package com.gracy.beans.interfaces.impl;

import com.gracy.beans.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres{
    private String name="Michelin";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MichelinTyres{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void rotate(){
        System.out.println("Michelin Tyres are rotating");
    }

}
