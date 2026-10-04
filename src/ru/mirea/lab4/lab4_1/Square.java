package ru.mirea.lab4.lab4_1;

public class Square extends Rectangle {
    public double side;
    public Square(double side, String color, boolean filled) {
        super(side, side,color,filled);
        this.side = side;
    }
    @Override
    public String getType() {
        return "Квадрат";
    }
    public Square(double side) {
        super(side, side,"RED", true);
        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }
    @Override
    public double getPerimeter() {
        return side*4;
    }
    public double getSide(){
        return side;
    }
    @Override
    public String toString(){
        return "Square[" + super.toString() + ", side=" + side + "]";
    }
}
