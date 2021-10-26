package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> filterCars(List<Car> cars, String count);
}
