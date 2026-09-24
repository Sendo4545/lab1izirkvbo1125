package ru.mirea.lab4.lab4_1;

public class Square extends Shape {
    public double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public String getType() {
        return "Квадрат";
    }
    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return side*4;
    }
    @Override
    public String toString(){
        return "Square [side = " + side + "]";
    }
}
