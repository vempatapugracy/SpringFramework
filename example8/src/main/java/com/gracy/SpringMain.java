package com.gracy;

import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class SpringMain {
    public static void main(String[] args) {
        var context=new ClassPathXmlApplicationContext("beans.xml");
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle using xml config "+veh.getName());
        veh.printHello();


    }

}
