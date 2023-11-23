package Arch3812.CarApp.CarApp.SOLID.DIP;

public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
    
}
