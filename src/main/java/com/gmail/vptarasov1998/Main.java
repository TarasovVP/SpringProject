package com.gmail.vptarasov1998;

import com.gmail.vptarasov1998.vehicle.Car;
import com.gmail.vptarasov1998.vehicle.ParameterCalculation;
import com.gmail.vptarasov1998.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.gmail.vptarasov1998");



        Vehicle car = context.getBean(Car.class);
        car.setName("Range Rover");
        car.setMaxSpeed(120);
        car.setFuelConsuption(15);
        car.setEngineCapacity(20);

        Vehicle car2 = context.getBean(Car.class);
        car.setName("Lada");
        car.setMaxSpeed(10);
        car.setFuelConsuption(15);
        car.setEngineCapacity(20);

        Vehicle car3 = context.getBean(Car.class);
        car.setName("Daewoo");
        car.setMaxSpeed(80);
        car.setFuelConsuption(15);
        car.setEngineCapacity(20);

        ParameterCalculation pc = context.getBean(ParameterCalculation.class);
        ArrayList<Vehicle> arList = pc.getListOfCars(20);


        System.out.println("Your vehicle is " + car.getClass().getSimpleName()
                + ". It`s name is " + car.getName()
                +  ", fuel consuption " + car.getFuelConsuption()
                + " and engine capacity " + car.getEngineCapacity(  ));
    }
}
