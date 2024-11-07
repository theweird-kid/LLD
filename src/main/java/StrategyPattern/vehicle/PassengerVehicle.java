package StrategyPattern.vehicle;

import StrategyPattern.drive.NormalDrive;

public class PassengerVehicle extends Vehicle {

    // Constructor
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
