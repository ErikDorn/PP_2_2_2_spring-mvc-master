package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCars(Integer integer) {
        List<Car> getCars; {
            getCars = new ArrayList<>();
            getCars.add(new Car("Honda", 2019, "$30000"));
            getCars.add(new Car("Mercedes-Benz", 2020, "$50000"));
            getCars.add(new Car("Lexus", 2021, "$40000"));
            getCars.add(new Car("Toyota", 2021, "$28000"));
            getCars.add(new Car("Kia", 2020, "$15000"));
        }
        return getCars.stream().limit(integer).collect(Collectors.toList());
    }
}
