package automatespringexercise.config;


import automatespringexercise.structure.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Car.class)
public class AutomatedAnnotationConfig {

}
