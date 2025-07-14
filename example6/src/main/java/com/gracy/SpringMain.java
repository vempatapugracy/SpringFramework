package com.gracy;

import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle1=context.getBean(Vehicle.class);

        System.out.println("using postconstruct annotation \""+vehicle1.getName()+"\"");
        vehicle1.printHello();

    }

}
