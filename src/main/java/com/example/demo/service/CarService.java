package com.example.demo.service;

import com.example.demo.constants.CarConstants;
import com.example.demo.exception.CarNotFoundException;
import com.example.demo.model.Car;
import com.example.demo.model.parts.Engine;
import com.example.demo.model.parts.Tires;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
    /*
    Additional Notes in README_EXPLANATIONS.md Section 3.2 Service Layer
     */

    public Car getCarByType(String carType) {
        ArrayList<Car> carDatabase = simulateDatabase();

        try {
            Car foundCar = carDatabase.stream()
                    .filter(car -> carType.equalsIgnoreCase(car.getType()))
                    .findFirst()
                    .orElse(null);

            if (foundCar != null) {
                return foundCar;
            } else {
                throw new CarNotFoundException("Car type not found");
            }
        }catch (Exception ex){
            return null;
        }

    }

    public ArrayList<Car> simulateDatabase(){
        ArrayList<Car> cars = new ArrayList<>();

        // Electrical
        Car elecCar = new Car();
        elecCar.setId("C001");
        elecCar.setModel("Tesla Model S");
        elecCar.setBrand("Tesla");
        elecCar.setColor("Black");
        elecCar.setType(CarConstants.ELECTRICAL);
        elecCar.setEngine(new Engine("E001" , "Engine 1", 200));
        elecCar.setTires(new Tires("T001", "Dunlop", 16));
        elecCar.setTireQty(4);
        cars.add(elecCar);

        // 2-wheel
        Car motorCar = new Car();
        motorCar.setId("C002");
        motorCar.setModel("Harley-Davidson Sportster");
        motorCar.setBrand("Harley-Davidson");
        motorCar.setColor("Red");
        motorCar.setType(CarConstants.TWO_WHEELS);
        motorCar.setEngine(new Engine("E002", "Engine 2", 50));
        motorCar.setTires(new Tires("T002", "GoodYear", 14));
        motorCar.setTireQty(2);
        cars.add(motorCar);

        // Sport
        Car sportCar = new Car();
        sportCar.setId("C003");
        sportCar.setModel("Ferrari 458 Italia");
        sportCar.setBrand("Ferrari");
        sportCar.setColor("Yellow");
        sportCar.setType(CarConstants.SPORT);
        sportCar.setEngine(new Engine("E001", "Engine 1", 300));
        sportCar.setTires(new Tires("T001", "Dunlop", 16));
        sportCar.setTireQty(4);
        cars.add(sportCar);

        return cars;
    }
}
