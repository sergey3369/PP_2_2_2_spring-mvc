package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ServiceCarsImpl implements ServiceCars {
    List<Car> list = Stream.of(
                    new Car("Car", "Car", "Car"),
                    new Car("Car1", "Car1", "Car1"),
                    new Car("Car2", "Car2", "Car2"),
                    new Car("Car3", "Car3", "Car3"),
                    new Car("Car4", "Car4", "Car4")
            )
            .collect(Collectors.toList());

    @Override
    public List<? extends Car> getEntity(int quantity) {
        return list.stream().limit(quantity > 5 ? 5 : quantity).collect(Collectors.toList());
    }
}
