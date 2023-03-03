package automatespringexercise.structure;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine{
    @Override
    public void TypeOfEngine() {
        System.out.println("Electric Engine is ready to deploy");
    }
}
