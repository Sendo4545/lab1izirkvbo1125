package ru.mirea.lab13;

import java.util.Locale;

public class Task1 {
    public static void processString(String str){
        System.out.println(str);
        System.out.println(str.charAt(str.length() -1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7,11));
    }
    public static void main(String[] args) {
        processString("I like Java!!!");
    }
}
