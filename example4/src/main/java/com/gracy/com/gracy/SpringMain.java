package com.gracy.com.gracy;

import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle1=context.getBean(Vehicle.class);
        System.out.println("using primaru annotation \""+vehicle1.getName()+"\"");

    }

}
