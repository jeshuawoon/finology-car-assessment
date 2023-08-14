package com.example.demo.model.parts;

import lombok.Data;

@Data
public class Tires {
    public Tires(String id, String brand, int size){
        this.id = id;
        this.brand = brand;
        this.size = size;
    }

    private String id;
    private String brand;
    private int size;
}