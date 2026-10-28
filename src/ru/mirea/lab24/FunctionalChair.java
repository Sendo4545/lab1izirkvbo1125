package ru.mirea.lab24;

public class FunctionalChair implements Chair{
    public int sum(int a, int b){
        return a + b;
    }
    @Override
    public void display(){
        System.out.println("Стул с калькулятором");
    }
}
