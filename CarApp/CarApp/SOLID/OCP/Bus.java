package Arch3812.CarApp.CarApp.SOLID.OCP;

public class Bus extends Vehicle {
    public Bus(int maxspeed) {
        super(maxspeed, "Bus");

    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}