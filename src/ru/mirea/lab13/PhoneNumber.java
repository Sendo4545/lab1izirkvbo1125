package ru.mirea.lab13;

public class PhoneNumber {
    public static String formatPhone(String Number){
        String countryCode;
        String digits;
        if (Number.startsWith("+")){
            int len = Number.length();
            countryCode = Number.substring(1, len - 10);
            digits = Number.substring(len - 10);
        }
        else if (Number.startsWith("8")) {
            countryCode = "7";
            digits = Number.substring(1);
        }
        else{
            return "Неопознанный формат";
        }
        StringBuilder formating = new StringBuilder();
        String first3 = digits.substring(0,3);
        String second3 = digits.substring(3,6);
        String last4 = digits.substring(6);
        formating.append("+").append(countryCode).append(first3).append("-").append(second3).append("-").append(last4);
        return formating.toString();
    }

    public static void main(String[] args) {
        String test1 = "+79652175351";
        String test2 = "89652175351";
        System.out.println(formatPhone(test1));
        System.out.println(formatPhone(test2));
    }

}
