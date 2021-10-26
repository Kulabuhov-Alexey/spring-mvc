package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> filterCars(List<Car> cars, String count) {
        if (count == null) {
            count = Integer.toString(cars.size());
        }
        return cars.stream().limit(Integer.parseInt(count)).collect(Collectors.toList());
    }
}
