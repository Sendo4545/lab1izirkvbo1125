package ru.mirea.lab13;
import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, building, apartment;
    public void parseWithSplit(String address){
        String [] tokens = address.split(",");
        if (tokens.length == 7){
            this.country = tokens[0].trim();
            this.region = tokens[1].trim();
            this.city = tokens[2].trim();
            this.street = tokens[3].trim();
            this.house = tokens[4].trim();
            this.building = tokens[5].trim();
            this.apartment = tokens[6].trim();
        }
        else{
            System.out.println("Некорректный формат");
        }
    }
    public void parseWithTokenizer(String address, String delimiters){
        StringTokenizer st = new StringTokenizer(address, delimiters);
        if (st.countTokens() == 7){
            this.country = st.nextToken().trim();
            this.region = st.nextToken().trim();
            this.city = st.nextToken().trim();
            this.street = st.nextToken().trim();
            this.house = st.nextToken().trim();
            this.building = st.nextToken().trim();
            this.apartment = st.nextToken().trim();
        }
        else{
            System.out.println("Некорректный формат");
            return;
        }
    }
    @Override
    public String toString(){
        return String.format(("Адрес: Страна: %s | Регион: %s | Город: %s | Улица: %s | Дом: %s | Корпус: %s | Кв: %s"), country, region, city, street, house, building, apartment);
    }

    public static void main(String[] args) {
        String add1 = "Россия, Московский регион, Москва, проспект Мира, 101, 2, 45";
        String add2 = "Россия; Ленинградская область; Санкт-Петербург; ул Ленина; 12; 1; 8";
        String add3 = "Беларусь. Минская область. Минск. ул Советская. 5. 3. 112";
        String add4 = "Россия, Новосибирская обл., Новосибирск; ул Кирова. 44, 1; 23";
        Address a1 = new Address();
        a1.parseWithSplit(add1);
        System.out.println(a1);
        Address a2 = new Address();
        a2.parseWithTokenizer(add2,";");
        System.out.println(a2);
        Address a3 = new Address();
        a3.parseWithTokenizer(add3,".");
        System.out.println(a3);
        Address a4 = new Address();
        a4.parseWithTokenizer(add4,",.;");
        System.out.println(a4);
    }
}

