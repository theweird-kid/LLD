package StrategyPattern.vehicle;

import StrategyPattern.drive.SpecialDriving;

public class OffRoadVehicle extends Vehicle {

    // Constructor
    public OffRoadVehicle() {
        super(new SpecialDriving());
    }
}
