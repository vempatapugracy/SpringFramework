package com.gracy.com.gracy;

import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle=context.getBean(Vehicle.class);

        System.out.println(vehicle.getName());
        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean(Integer.class));
    }

}
