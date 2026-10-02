package ru.mirea.lab14;

import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
public class Task5 {
    public static boolean findDate(String input){
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19[0-9]{2}|[2-9][0-9]{3})$";
        if (!Pattern.matches(regex, input)) {
            return false;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(input);
            return true;
        } catch (java.text.ParseException e) {
            return false;
        }
    }
    public static void main(String[] args){
        String [] valid = {"29/02/2000", "30/04/2003","01/01/2003"};
        String [] nonvalid = {"29/02/2001", "30-04-2003","1/1/1899"};
        for (String date : valid){
            System.out.println(findDate(date));
        }
        System.out.println();
        for (String date : nonvalid){
            System.out.println(findDate(date));
        }
    }
}
