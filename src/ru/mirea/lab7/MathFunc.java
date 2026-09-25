package ru.mirea.lab7;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double base, double exponent){
        return Math.pow(base,exponent);
    }
    @Override
    public double module(double real, double imaginary){
        return Math.sqrt(real*real + imaginary*imaginary);
    }
    public double length(double radius){
        return 2*PI*radius;
    }
}
