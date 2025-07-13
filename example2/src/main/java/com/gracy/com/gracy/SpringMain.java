package com.gracy.com.gracy;

import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle1=context.getBean("veh1",Vehicle.class);
        System.out.println(vehicle1.getName());

        var vehicle2=context.getBean("veh2",Vehicle.class);
        System.out.println(vehicle2.getName());

        var vehicle3=context.getBean("veh3",Vehicle.class);
        System.out.println(vehicle3.getName());

    }

}
