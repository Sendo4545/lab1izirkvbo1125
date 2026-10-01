package ru.mirea.lab8;

public class Task2 {
    public static void Recurs(int n) {
        if (n==0){
            return;
        }
        Recurs(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        int n = 10;
        Recurs(n);
        }

}
