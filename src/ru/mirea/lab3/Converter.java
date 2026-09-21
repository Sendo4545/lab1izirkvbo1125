package ru.mirea.lab3;
import java.util.Scanner;
public class Converter {
    private static final double usd_to_rub = 84.02;
    public static double convert(double amount, String fromCurrency, String toCurrency) {
        fromCurrency = fromCurrency.toUpperCase();
        toCurrency = toCurrency.toUpperCase();
        if (fromCurrency.equals("USD") && toCurrency.equals("RUB")) {
            return amount * usd_to_rub;
        } else if (fromCurrency.equals("RUB") && toCurrency.equals("USD")) {
            return amount / usd_to_rub;
        }
        return amount;

    }
}



