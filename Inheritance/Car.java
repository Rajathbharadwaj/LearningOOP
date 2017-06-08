package com.Inheritance;

/**
 * Created by BIC on 6/5/2017.
 */
public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean TransmissionAutomatic;


    private int currentGear;


    public Car(String name, String size, int wheels, int doors, int gears, boolean transmissionAutomatic) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.TransmissionAutomatic = transmissionAutomatic;
        this.currentGear = 1;
    }


    public void ChangeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() is " +this.currentGear + "gear");

    }

    public void ChangeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println(speed + " , " + direction);

    }

}
