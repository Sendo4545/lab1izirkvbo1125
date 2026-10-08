package ru.mirea.lab24;

public class Complex {
    private final int real;
    private final int im;
    public Complex(){
        this.real = 0;
        this.im = 0;
    }
    public Complex(int real, int im){
        this.real = real;
        this.im = im;
    }
    public String toString() {
        if (im >= 0) {
            return real + " + " + im + "i";
        } else {
            return real + " - " + Math.abs(im) + "i";
        }
    }
}
