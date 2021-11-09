package pl.mirekgab.car;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

        @Bean
        public CommandLineRunner commandLineRunner(CarRepository carRepository) {
            return run->{
                carRepository.save(new Car("Fiat", "Panda", "hatchback",2000,"blue", "gas", "manual"));
                carRepository.save(new Car("Audi", "80", "sedan",1990,"black", "gas", "manual"));
                carRepository.save(new Car("Ford", "Escort", "combi",1990,"white", "diesel", "automatic"));
                carRepository.save(new Car("Fiat", "Seicento", "hatchback", 2000, "white", "gas", "manual"));
            };
        }
}
