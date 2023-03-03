package automatespringexercise.structure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CombustionEngine implements Engine{


    public CombustionEngine(){
        System.out.println("In the combustion engine constructor");
    }
    @Override
    public void TypeOfEngine() {
        System.out.println("Combustion engine is ready to run");
    }
}
