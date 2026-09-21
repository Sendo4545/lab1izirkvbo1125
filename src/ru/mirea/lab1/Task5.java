package ru.mirea.lab1;

public class Task5 {
    public static void main(String[] args){
        System.out.println("Аргументы командной строки");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент [" + i + "]: " + args[i]);
        }
        if (args.length == 0) {
            System.out.println("Аргументы не были переданы.");
        }
    }
}
