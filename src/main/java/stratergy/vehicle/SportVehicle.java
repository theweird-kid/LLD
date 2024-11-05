package stratergy.vehicle;

import stratergy.drive.DriveStrategy;
import stratergy.drive.SpecialDriving;

public class SportVehicle extends Vehicle {

    // Constructor
    public SportVehicle() {
        super(new SpecialDriving());
    }
}
