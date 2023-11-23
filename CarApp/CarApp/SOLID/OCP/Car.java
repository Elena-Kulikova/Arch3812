package Arch3812.CarApp.CarApp.SOLID.OCP;

public class Car extends Vehicle {
    public Car(int maxspeed) {
        super(maxspeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}