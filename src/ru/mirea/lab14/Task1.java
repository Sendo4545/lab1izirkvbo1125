package ru.mirea.lab14;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        String [] elements = pattern.split(input);
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("Элемент [%d]: %s%n", i, elements[i]);
        }
    }
}
