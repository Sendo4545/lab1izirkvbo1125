package ru.mirea.lab28;
import java.util.Map;
import java.util.Hashtable;

public class Mapp {
    public static Map<String,String> createMap(){
        Map<String,String> map = new Hashtable<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Пётр");
        map.put("Сидоров", "Иван");
        map.put("Кузнецов", "Алексей");
        map.put("Попов", "Пётр");
        map.put("Васильев", "Максим");
        map.put("Соколов", "Иван");
        map.put("Михайлов", "Михаил");
        map.put("Новиков", "Дмитрий");
        map.put("Федоров", "Сергей");
        return map;
    }
    public static int getSameFirstNameCount (Map<String,String> map){
        int c = 0;
        for (String name:map.values()){
            int sames = 0;
            for (String cur: map.values()){
                if(cur.equals(name)){
                    sames ++;
                }
            }
            if (sames > 1){
                c ++;
            }
        }
        return c;

    }
    public static int getSameLastNameCount(Map<String,String> map){
        int c = 0;
        for (String lastname:map.keySet()){
            int sames = 0;
            for (String cur: map.keySet()){
                if(cur.equals(lastname)){
                    sames ++;
                }
            }
            if (sames > 1){
                c ++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Map<String,String> test = Mapp.createMap();
        System.out.println(Mapp.getSameFirstNameCount(test));
        System.out.println(Mapp.getSameLastNameCount(test));
    }
}
