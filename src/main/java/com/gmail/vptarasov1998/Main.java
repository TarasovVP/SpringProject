package com.gmail.vptarasov1998;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        int speed = 0;


        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.gmail.vptarasov1998");

        Vehicle car = context.getBean(Car.class);
        car.name = "Range Rover";
        car.maxSpeed = 120;
        car.fuelConsuption = 15;
        car.engineCapacity = 20;

        Vehicle bus = context.getBean(Bus.class);
        bus.name = "LAZ";
        bus.maxSpeed = 120;
        bus.fuelConsuption = 15;
        bus.engineCapacity = 20;

        Vehicle motobike = context.getBean(Motobike.class);
        motobike.name = "Yava";
        motobike.maxSpeed = 120;
        motobike.fuelConsuption = 15;
        motobike.engineCapacity = 20;

        System.out.println(checkSpeed(222, car));

    }
    public static boolean checkSpeed(int speed, Vehicle vehicle){

            if (speed <= vehicle.maxSpeed){
                return true;
        }

        return false;
    }
}
