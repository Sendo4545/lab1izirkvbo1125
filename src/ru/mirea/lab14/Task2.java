package ru.mirea.lab14;
import java.util.regex.Pattern;
public class Task2 {
    public static boolean valid(String input){
        String regex = "^abcdefghijklmnopqrstuv18340$";
        return Pattern.matches(regex, input);

    }

    public static void main(String[] args) {
        String test1 = "abcdefghijklmnopqrstuv18340";
        String test2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(valid(test1));
        System.out.println(valid(test2));
    }
}
