package example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Cars {
	
    @Autowired
    List<Car> cars;
    

    public void printCarOwners(Owner owner) {

        for(Car car : cars) {
        	System.out.println(car.getName());
            System.out.println(car.someMethod(owner));
        }
    }
}