package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args){
        Author test = new Author("Артур","izirbekova@mail.ru",'M');
        System.out.println(test);
        test.setEmail("artur@mail.ru");
        System.out.println("Обновленный email: " + test.getEmail());
        System.out.println(test);
    }


}
