package example.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
class Mazda extends Car {
    public String getName() {
        return "Mazda";
    }
}
