package ru.mirea.lab24;

public class VictorianChair implements Chair{
    int age;
    public VictorianChair(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public void display(){
        System.out.println("Викторианский стул. Возраст: " + age + " лет");
    }
}
