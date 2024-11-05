package stratergy.vehicle;

import stratergy.drive.DriveStrategy;
import stratergy.drive.NormalDrive;

public class PassengerVehicle extends Vehicle {

    // Constructor
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
