package automatespringexercise.structure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine;
    @Autowired
    public Car(@Qualifier("combustionEngine") Engine engine){
        System.out.println("In the engine constructor");
        this.engine=engine;
    }

    public void start(){
        System.out.println("Car is ready to start");
    }

}
