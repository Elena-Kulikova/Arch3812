package Arch3812.CarApp.CarApp.SOLID.LSP;

public class Rectangle extends RectangleForm{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}