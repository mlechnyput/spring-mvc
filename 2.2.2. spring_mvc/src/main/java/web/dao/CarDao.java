package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private List<Car> cars, cars2;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", 322, 1975));
        cars.add(new Car("Mosckvitch", 2140, 2020));
        cars.add(new Car("Nissan", 31, 2003));
        cars.add(new Car("Porsche", 911, 1993));
        cars.add(new Car("Fiat", 5, 1988));
        cars.add(new Car("Lada", 2110, 2019));
        cars.add(new Car("Suzuki", 19, 2020));
        cars.add(new Car("Schkoda", 429, 2011));
    }

    public List<Car> getCars(Integer count) {
        if (count==null) return cars;
        if (count < 5) cars2 = cars.stream().limit(count).collect(Collectors.toList());
        else cars2=cars;
        return cars2;
    }
}
