package com.gracy.services;

import com.gracy.beans.interfaces.Speakers;
import com.gracy.beans.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {

    private Speakers speakers;
    private Tyres tyres;

    @Autowired
    public VehicleServices(Speakers speakers, Tyres tyres){
        this.speakers=speakers;
        this.tyres=tyres;
        System.out.println("**VehicleService object created**");
    }

    @Override
    public String toString() {
        return "VehicleServices{" +
                "speakers=" + speakers +
                ", tyres=" + tyres +
                '}';
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
