package ru.mirea.lab24;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Мэджик");
    }
    @Override
    public void display(){
        System.out.println("Магический стул");
    }
}
