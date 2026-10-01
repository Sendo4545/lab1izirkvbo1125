package ru.mirea.lab7;

public class MathTest {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        double base = 6;
        double exp = 2;
        double real = 3;
        double imaginary = 4;
        double radius = 5;
        System.out.println(mc1.pow(base,exp));
        System.out.println(mc1.module(real,imaginary));
        System.out.println(((MathFunc)mc1).length(radius));
    }
}
