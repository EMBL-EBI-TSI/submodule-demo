package example.carvalues;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import example.service.Car;
import example.service.Owner;

@Component
class Alfa implements Car {
	
    public String getName() {
        return "Alfa";
    }

	@Override
	public String someMethod(Owner owner) {
		// TODO Auto-generated method stub
		return owner.getGender();
	}
}
