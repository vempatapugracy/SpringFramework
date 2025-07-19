package com.gracy;

import com.gracy.beans.Person;
import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class SpringMain {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person per=context.getBean(Person.class);
//        Vehicle veh=context.getBean(Vehicle.class);

//        System.out.println("Vehicle name using @Component "+veh.getName());
//        veh.printHello();

        System.out.println("Person name from @Component  "+per.getName());
        System.out.println("Person vehicle from @Autowired "+per.getVehicle());


    }

}
