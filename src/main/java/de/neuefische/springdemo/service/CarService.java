package de.neuefische.springdemo.service;

import de.neuefische.springdemo.model.Car;
import de.neuefische.springdemo.repo.CarRepo;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private CarRepo carRepo = new CarRepo();
    private List<Car> carList = new ArrayList<>();


public void addCar(Car carToAdd) {
    carRepo.addCar(carToAdd);
}

/* mit Rückgabetyp
public Car addCar(Car car){
    return carRepo.addCar(car)
}

 */

public List<Car> getCars() {
    return carList;
    }



}
