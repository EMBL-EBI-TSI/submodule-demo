package example.service;

import example.service.Cars;
import example.service.Owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Rover;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages ={ "com.example.demo","example.service"})
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private Cars cars;
	
	@Autowired
	private Rover rover;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... strings) throws Exception {
		Owner owner = new Owner("jeff", "M");
		cars.printCarOwners(owner);
	}
}
