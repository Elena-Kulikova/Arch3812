package Arch3812.CarApp.CarApp.SOLID.ISP;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}