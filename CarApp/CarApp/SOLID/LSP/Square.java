package Arch3812.CarApp.CarApp.SOLID.LSP;

public class Square extends RectangleForm{
    private int width;
    private int height;
    public Square(int width, int height){
        this.height = height;
        this.width = width;
    }

    @Override
    public int area(){
        return width * height;
    }
}