package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class DB {
    
    private List<Car> data = Arrays
        .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    public DB(){

    }

    public Car getCarById(String id){
        for (Car car : data) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    } 

    public List<Car> getAllCars(){
        return data;
    }
}
