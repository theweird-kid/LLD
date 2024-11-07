package StrategyPattern.drive;

public class SpecialDriving implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special Driving..");
    }
}
