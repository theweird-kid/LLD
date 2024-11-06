package stratergyPattern.vehicle;

import stratergyPattern.drive.SpecialDriving;

public class SportVehicle extends Vehicle {

    // Constructor
    public SportVehicle() {
        super(new SpecialDriving());
    }
}
