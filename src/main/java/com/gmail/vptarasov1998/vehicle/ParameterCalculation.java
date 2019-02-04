package com.gmail.vptarasov1998.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParameterCalculation {

    @Autowired
    private Car car;
    @Autowired
    private Bus bus;
    @Autowired
    private Motobike motobike;

    public int getFuelConsumption(int km, int fuel){
        int fuelConsuption;
        return fuelConsuption = fuel/km * 100;
    }
    public ArrayList<Vehicle> getListOfCars(int speed){
        ArrayList<Vehicle> listVehicle= new ArrayList<>();
        if (speed <= car.getMaxSpeed()){
            listVehicle.add(car);
        }else if (speed <= bus.getMaxSpeed()){
            listVehicle.add(bus);
        }else if (speed <= motobike.getMaxSpeed()){
            listVehicle.add(motobike);
        }return listVehicle;
    }

}
