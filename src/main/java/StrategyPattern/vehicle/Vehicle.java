package StrategyPattern.vehicle;

import StrategyPattern.drive.DriveStrategy;

public class Vehicle {
    DriveStrategy drv;

    // Constructor Injection
    public Vehicle(DriveStrategy obj) {
        this.drv = obj;
    }

    public void drive() { drv.drive(); }
}
