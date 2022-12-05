package de.neuefische.springdemo.repo;

import de.neuefische.springdemo.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepo {

    private List<Car> carList = new ArrayList<Car>();

    public void addCar(Car carToAdd) {
        carList.add(carToAdd);
    }

    /*
    // wenn wir einen Rückgabeparameter haben wollen
    public Car addCar(Car car) {
        carList.addCar;
        return car;
    }

     */

    public List<Car> getCars() {
        return carList;

    }

}

