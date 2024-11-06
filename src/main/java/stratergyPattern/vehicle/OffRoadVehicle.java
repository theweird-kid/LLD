package stratergyPattern.vehicle;

import stratergyPattern.drive.SpecialDriving;

public class OffRoadVehicle extends Vehicle {

    // Constructor
    public OffRoadVehicle() {
        super(new SpecialDriving());
    }
}
