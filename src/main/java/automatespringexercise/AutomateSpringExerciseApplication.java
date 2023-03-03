package automatespringexercise;

import automatespringexercise.config.AutomatedAnnotationConfig;
import automatespringexercise.structure.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutomateSpringExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutomateSpringExerciseApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(AutomatedAnnotationConfig.class);
        Car car = context.getBean(Car.class);
        car.start();
    }

}
