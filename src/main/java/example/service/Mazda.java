package example.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
class Mazda implements Car {
	
    public String getName() {
        return "Mazda";
    }

	@Override
	public String someMethod(Owner owner) {
		return owner.getName();
	}
}
