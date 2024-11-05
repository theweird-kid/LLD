package stratergy.vehicle;

import stratergy.drive.DriveStrategy;

public class Vehicle {
    DriveStrategy drv;

    // Constructor Injection
    public Vehicle(DriveStrategy obj) {
        this.drv = obj;
    }

    public void drive() { drv.drive(); }
}
