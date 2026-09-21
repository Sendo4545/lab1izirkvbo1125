package ru.mirea.lab3;

public class Task2_1 {
    public static void main(String[] args){
        Double d1 = Double.valueOf(17.09);
        Double d2 = Double.valueOf(20.05);
        String s1 = "42.42";
        double sd = Double.parseDouble(s1);
        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        System.out.println("Объект d1 = " + d1);
        System.out.println("Объект d2 = " + d2);
        String d = Double.toString(3.14);
        System.out.println("Строка из литерала: " + d);

    }
}
