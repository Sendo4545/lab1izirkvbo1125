package ru.mirea.lab8;
import java.util.Scanner;

public class Task11 {
    private static final Scanner scanner = new Scanner(System.in);
    public static int OnesCounter(){
        int cur = scanner.nextInt();
        if (cur == 0){
            int next = scanner.nextInt();
            if (next == 0){
                return 0;
            }
            return (next == 1 ? 1:0) + OnesCounter();
        }
        return (cur == 1 ? 1:0) + OnesCounter();

    }

    public static void main(String[] args) {
        System.out.print(OnesCounter());
    }
}
