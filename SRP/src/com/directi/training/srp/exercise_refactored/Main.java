package com.directi.training.srp.exercise_refactored;

public class Main {
    public static void main(String[] args) {
        

        CarManager manager = new CarManager();

        System.out.println("All Car Names: " + manager.getCarsNames());

        Car bestCar = manager.getBestCar();
        System.out.println("Best Car: " + bestCar.getBrand() + " " + bestCar.getModel());

        Car car = manager.getFromDb("2");
        System.out.println("Car with ID 2: " + (car != null ? car.getBrand() + " " + car.getModel() : "Not found"));
    }
}
