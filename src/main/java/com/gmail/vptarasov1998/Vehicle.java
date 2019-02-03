package com.gmail.vptarasov1998;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    String name;
    int engineCapacity;
    int maxSpeed;
    int fuelConsuption;

    public int getFuelConsumption(int km){
        fuelConsuption = fuelConsuption/100 * km;
        return fuelConsuption;
    }

}
