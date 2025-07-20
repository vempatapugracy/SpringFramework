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
        System.out.println("Before retrieving person bean from spring context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving person bean from spring context");
    }
}
