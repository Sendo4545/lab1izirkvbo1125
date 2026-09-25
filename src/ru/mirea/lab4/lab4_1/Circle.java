package ru.mirea.lab4.lab4_1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public String getType() {
        return "Круг";
    }
    @Override
    public double getArea() {
        return Math.PI * radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String toString(){
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}