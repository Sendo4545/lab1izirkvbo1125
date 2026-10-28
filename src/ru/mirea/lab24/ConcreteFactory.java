package ru.mirea.lab24;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex(){
        return new Complex();
    }
    @Override
    public Complex createComplex(int real, int im){
        return new Complex(real, im);
    }
}
