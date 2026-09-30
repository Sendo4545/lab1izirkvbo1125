package ru.mirea.lab8;
import java.util.Scanner;

public class Task12 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void Nechet(){

        int cur = scanner.nextInt();
        if (cur == 0){
            return;
        }

        if(cur % 2 != 0){
            System.out.print(cur + " ");
        }
        Nechet();
    }

    public static void main(String[] args) {
        Nechet();
        System.out.println();
    }
}
