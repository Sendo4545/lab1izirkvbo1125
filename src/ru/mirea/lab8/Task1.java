package ru.mirea.lab8;

public class Task1 {
    public static int Triang(int i, int cur, int counter){
        if (i == 1){
            return cur;
        }
        if (counter == cur){
            return Triang(i - 1, cur +1,1);
        }
        else{
            return Triang(i - 1, cur, counter + 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++){
            System.out.println(Triang(i,1,1));
        }
    }
}
