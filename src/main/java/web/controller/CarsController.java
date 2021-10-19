package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    private final Car car;

    public CarsController(Car car) {
        this.car = car;
    }

    @GetMapping(value = "cars")
    public String printWelcome(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        List cars = car.getListCar();
        if (count == null) {
            count = Integer.toString(cars.size());
        }
        model.addAttribute("cars",cars.stream().limit(Integer.parseInt(count)).collect(Collectors.toList()));
        return "cars";
    }

}
