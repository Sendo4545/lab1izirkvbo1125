package ru.mirea.lab29;
import java.io.PrintWriter;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        int n = scanner.nextInt();
        int roads = 0;
        for (int i =0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                int road = scanner.nextInt();
                if (j > i && road == 1){
                    roads ++;
                }
            }
        }
        printWriter.println(roads);
        scanner.close();
        printWriter.close();
    }


}
