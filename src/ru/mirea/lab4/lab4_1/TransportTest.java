package ru.mirea.lab4.lab4_1;

public class TransportTest {
    public static void main(String[] args) {
        double distance = 1000.0;
        int persons = 4;
        double weight = 100.0;
        Transport[] transports = new Transport[] {
                new Car(), new Ship(), new Plane(), new Train()
        };
        for (Transport transport : transports ){
            double time = transport.Time(distance);
            double cost_for_person = transport.personCost(distance, persons);
            double cost_for_cargo = transport.cargoCost(distance,weight);
            System.out.println(transport.getName());
            System.out.println("Время = " + time + " часов");
            System.out.println("Стоимость перевозки пассажиров = " + cost_for_person +  " рублей");
            System.out.println("Стоимость перевозки груза = " + cost_for_cargo +  " рублей");
            System.out.println();
        }

    }
}
