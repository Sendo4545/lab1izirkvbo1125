package ru.mirea.lab8;

public class Task10 {
    public static int Reverse(int n,int res){
        if (n == 0){
            return res;
        }
        return Reverse(n/10, res*10 + (n % 10));
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Reverse(n,0));
    }
}
