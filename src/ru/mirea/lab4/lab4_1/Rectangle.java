package ru.mirea.lab4.lab4_1;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    @Override
    public String getType() {
        return "Прямоугольник";
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2* width + 2* length;
    }
    public double getLength(){
        return length;
    }
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }


}
