package ru.mirea.lab14;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Task3 {
    public static void Prices(String input){
        String regex = "(?<!\\.)\\b\\d+(\\.\\d{1,2})?(?!\\d)\\s(USD|RUB|EU)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args){
        String test = "В чеке были позиции: 25.98 USD, 1000 RUB и 45 EU. Ошибочные варианты: 44 ERR, а еще 0.004 EU.";
        Prices(test);
    }

}
