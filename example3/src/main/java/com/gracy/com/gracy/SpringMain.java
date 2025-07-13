package com.gracy.com.gracy;

import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle1=context.getBean("audiVehicle",Vehicle.class);
        System.out.println("calling with Custom name "+vehicle1.getName());

        var vehicle2=context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("calling with Custom name "+vehicle2.getName());

        var vehicle3=context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("calling with Custom name "+vehicle3.getName());

    }

}
