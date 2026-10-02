package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static boolean findDigits(String input){
        String regex = "\\d+(?!\\s*\\+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean foundPlus = false;
        return matcher.find();
    }
    public static void main(String[] args){
        String test = "(1 + 8) - 9 / 4";
        String test2 = "6 / 5 - 2 * 9";
        System.out.println(findDigits(test));
        System.out.println(findDigits(test2));
    }
}
