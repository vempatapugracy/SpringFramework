import com.gracy.beans.Person;
import com.gracy.beans.Vehicle;
import com.gracy.beans.interfaces.Speakers;
import com.gracy.beans.interfaces.Tyres;
import com.gracy.com.gracy.config.ProjectConfig;
import com.gracy.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices",VehicleServices.class);
        System.out.println("vehicleServices1: "+vehicleServices1.hashCode());
        System.out.println("vehicleServices2: "+vehicleServices2.hashCode());
    }
}
