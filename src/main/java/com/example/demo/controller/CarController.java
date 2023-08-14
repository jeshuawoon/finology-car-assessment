package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    /*
    Additional Notes in README_EXPLANATIONS.md Section 3.1 Controller Layer
     */

    @Autowired
    private CarService carService;

    @GetMapping("/{carType}")
    public ResponseEntity<Car> getCarByType(@PathVariable String carType) {
        Car car = carService.getCarByType(carType);

        return ResponseEntity.ofNullable(car);
    }
}