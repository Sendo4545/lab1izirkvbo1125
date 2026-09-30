package ru.mirea.lab8;

public class Task3 {
    public static void Ascend(int A, int B){
        System.out.println(A + "");
        if (A == B) {
            return;
        }
        if (A < B){
            Ascend(A+1,B);
        }
        else{
            Ascend(A-1,B);
        }

    }

    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        Ascend(A,B);
        System.out.print("\n");
        int A2 = 10;
        int B2 = 5;
        Ascend(A2,B2);
    }
}
