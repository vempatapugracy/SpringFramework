package com.gracy;

import com.gracy.beans.Vehicle;
import com.gracy.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class SpringMain {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen=new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> VolksWagenSupplier=()-> volkswagen;

        Supplier<Vehicle> AudiSupplier=()->{
            Vehicle audi=new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random=new Random();
        int randomNumber=random.nextInt(10);
        System.out.println(randomNumber);

        if(randomNumber%2==0){
            context.registerBean("volkswagen",Vehicle.class,VolksWagenSupplier);
        }
        else{
            context.registerBean("audi",Vehicle.class,AudiSupplier);
        }

        Vehicle volkswagenVehicle=null;
        Vehicle audiVehicle=null;

        try {
            volkswagenVehicle = (Vehicle) context.getBean("volkswagen");
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error Creating Volkswagen Bean");
        }

        try {
            audiVehicle = (Vehicle) context.getBean("audi");
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error Creating Audi Bean");
        }

        if(null != volkswagenVehicle){
            System.out.println("Vehicle Created "+volkswagenVehicle.getName());
        }
        else{
            System.out.println("Vehicle Created "+audiVehicle.getName());
        }



    }

}
