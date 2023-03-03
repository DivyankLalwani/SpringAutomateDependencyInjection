package automatespringexercise.mainFile;

import automatespringexercise.config.AutomatedAnnotationConfig;
import automatespringexercise.structure.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutomateSpringExercise {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AutomatedAnnotationConfig.class);
        System.out.println("Before getting car bean");
        Car car = context.getBean(Car.class);
        car.start();
        System.out.println("After getting car bean");
    }
}
