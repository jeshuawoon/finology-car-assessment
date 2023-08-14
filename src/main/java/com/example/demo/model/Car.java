package com.example.demo.model;

import com.example.demo.model.parts.Engine;
import com.example.demo.model.parts.Tires;
import lombok.Data;

@Data
public class Car {
    /*
        Additional Notes in README_EXPLANATIONS.md Section 3.3 Bean Inclusion
    */

    private String id;
    private String model;
    private String brand;
    private String color;
    private String type;
    private Engine engine;
    private Tires tires;
    private int tireQty;

}
