import com.gracy.beans.Person;
import com.gracy.beans.Vehicle;
import com.gracy.beans.interfaces.Speakers;
import com.gracy.beans.interfaces.Tyres;
import com.gracy.com.gracy.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person=context.getBean(Person.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        System.out.println("Person name: "+person.getName());
        System.out.println("Person Vehicle: "+person.getVehicle());
        System.out.println("Vehicle's name: "+vehicle.getName());
        System.out.println("Vehicle's Services: "+vehicle.getVehicleServices());
        Speakers speakers=vehicle.getVehicleServices().getSpeakers();
        Tyres tyres=vehicle.getVehicleServices().getTyres();
        speakers.makeSound();
        tyres.rotate();

    }
}
