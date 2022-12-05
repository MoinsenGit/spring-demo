package de.neuefische.springdemo.controller;

import de.neuefische.springdemo.model.Car;
import de.neuefische.springdemo.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")

public class CarController {

    private final static CarService carService = new CarService();

    @PostMapping
    public Car addCar(@RequestBody Car carToAdd) {
        carService.addCar(carToAdd);
        return carToAdd;
    }

    @GetMapping
    public List<Car> getCarList() {
        carService.getCars();
        return null;
    }


}
