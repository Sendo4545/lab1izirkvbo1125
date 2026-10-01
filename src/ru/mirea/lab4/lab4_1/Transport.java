package ru.mirea.lab4.lab4_1;

public abstract class Transport {
    private double speed;
    private double tariff_for_person;
    private double tariff_for_cargo;
    public Transport(double speed, double tariff_for_person, double tariff_for_cargo){
        this.speed = speed;
        this.tariff_for_cargo = tariff_for_cargo;
        this.tariff_for_person = tariff_for_person;
    }
    public double Time(double distance){
        return distance/speed;
    }
    public double personCost(double distance, int persons){
        return tariff_for_person*distance*persons;
    }
    public double cargoCost(double distance, double weight){
        return tariff_for_cargo*distance*weight;
    }
    public abstract String getName();
}

class Car extends Transport{
    public Car(){
        super(120,4.0,0.5);
    }
    @Override
    public String getName(){
        return "Автомобиль";
    }
}
class Plane extends Transport{
    public Plane(){
        super(800,15.0,2.0);
    }
    @Override
    public String getName(){
        return "Самолёт";
    }
}

class Train extends Transport{
    public Train(){
        super(240,6.0,1.0);
    }
    @Override
    public String getName(){
        return "Поезд";
    }
}

class Ship extends Transport{
    public Ship(){
        super(60,9.0,1.5);
    }
    @Override
    public String getName(){
        return "Корабль";
    }
}

