package com.example.demo.model.parts;

import lombok.Data;

@Data
public class Engine {
    public Engine(String id, String name, int horsepower){
        this.id = id;
        this.name = name;
        this.horsepower = horsepower;
    }

    private String id;
    private String name;
    private int horsepower;
}
