package stratergy.vehicle;

import stratergy.drive.DriveStrategy;
import stratergy.drive.SpecialDriving;

public class OffRoadVehicle extends Vehicle {

    // Constructor
    public OffRoadVehicle() {
        super(new SpecialDriving());
    }
}
