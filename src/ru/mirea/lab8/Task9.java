package ru.mirea.lab8;

public class Task9 {
    public static int ZerosOnes(int a, int b){
        if (a > b + 1){
            return 0;
        }
        if (a == 0){
            return 1;
        }
        if (b == 0){
            return a == 1 ? 1:0;
        }
        return ZerosOnes(a,b-1) + ZerosOnes(a-1,b-1);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.print(ZerosOnes(a,b));
    }

}
