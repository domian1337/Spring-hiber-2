package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.*;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        Collections.addAll(cars, new Car("Japan", "Toyota", 1994),
                new Car("Germany", "Mercedes", 2022),
                new Car("USA", "Ford", 2010),
                new Car("Italy", "Ferrari", 2015),
                new Car("Russia", "Lada", 2024));
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars1 = new ArrayList<>();
        cars.stream().limit(count).forEach(cars1::add);
        return cars1;
    }
}
