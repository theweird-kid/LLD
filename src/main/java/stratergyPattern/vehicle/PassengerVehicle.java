package stratergyPattern.vehicle;

import stratergyPattern.drive.NormalDrive;

public class PassengerVehicle extends Vehicle {

    // Constructor
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
