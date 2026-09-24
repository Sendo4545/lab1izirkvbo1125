package ru.mirea.lab4.lab4_1;

public class Shape {
    public String getType() {
        return "Фигура";
    }
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
    @Override
    public String toString(){
        return "Shape []";
    }
}
