package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarManager {

    private DB _db;
    private CarService _carService;
    private CarFormatter _CarFormatter;

    
    public CarManager(){
        _db = new DB();
        _carService = new CarService();
        _CarFormatter = new CarFormatter();
    }

    public Car getFromDb(final String carId)
    {
        return _db.getCarById(carId);
        
    }

    public Car getBestCar()
    {
        List<Car> cars = _db.getAllCars();
        return _carService.getBestCar(cars);
    }

    public String getCarsNames(){
        List<Car> cars = _db.getAllCars();
        return _CarFormatter.Format(cars);
    }
}
