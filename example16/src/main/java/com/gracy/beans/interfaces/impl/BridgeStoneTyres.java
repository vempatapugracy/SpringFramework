package com.gracy.beans.interfaces.impl;

import com.gracy.beans.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    private String name="BridgeStone";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BridgeStoneTyres{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void rotate() {
        System.out.println("BridgeTyre Stones are rotating!");
    }
}