package ru.mirea.lab9;

public class Task3 {

    public static Students[] mergeTwoLists(Students[] list1, Students[] list2) {
        Students[] result = new Students[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < list1.length && j < list2.length) {

            if (list1[i].compareTo(list2[j]) <= 0) {
                result[k] = list1[i];
                i++;
            } else {
                result[k] = list2[j];
                j++;
            }
            k++;
        }
        while (i < list1.length) {
            result[k] = list1[i];
            i++;
            k++;
        }
        while (j < list2.length) {
            result[k] = list2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
        Students[] list1 = {
                new Students("Артур",27,4.5),
                new Students("Дима",44,4.8)
        };
        Students[] list2 = {
                new Students("Стас",15,3.5),
                new Students("Ваня",20,4.0),
                new Students("Паша",21,5.0)
        };
        Students[] merged = mergeTwoLists(list1,list2);
        for (Students s : merged){
            System.out.println(s);
        }
    }
}
