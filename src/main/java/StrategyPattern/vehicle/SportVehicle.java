package StrategyPattern.vehicle;

import StrategyPattern.drive.SpecialDriving;

public class SportVehicle extends Vehicle {

    // Constructor
    public SportVehicle() {
        super(new SpecialDriving());
    }
}
