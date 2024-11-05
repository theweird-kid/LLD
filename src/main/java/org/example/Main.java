package org.example;

import stratergy.drive.DriveStrategy;
import stratergy.drive.NormalDrive;
import stratergy.vehicle.PassengerVehicle;
import stratergy.vehicle.SportVehicle;
import stratergy.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Vehicle v1 = new PassengerVehicle();
        Vehicle v2 = new SportVehicle();
        v1.drive();
        v2.drive();
    }
}