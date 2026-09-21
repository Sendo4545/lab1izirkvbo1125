package ru.mirea.lab1;

public class Task7 {
    public static long Factorial(int n){
        if (n < 0){
            System.out.println("Факториал отрицательного числа не существует.");
            return -1;
        }
        long res = 1;
        for (int i = 1; i < n; i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args){
        int test = 6;
        System.out.println("Факториал числа " + test + " = " + Factorial(test));
    }
}
