package ru.mirea.lab13;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
    public String FIO(){
        if (lastName.isEmpty()){
            return "Фамилия отсутствует";
        }
        StringBuilder sb = new StringBuilder(lastName);
        if (!firstName.isEmpty()){
            sb.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (!middleName.isEmpty()){
            if (firstName.isEmpty()){
                sb.append(" ");
            }
            sb.append(middleName.charAt(0)).append(".");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Иванов","Иван", "Иванович");
        Person p2 = new Person("", "Артур", "Маратович");
        Person p3 = new Person("Cухов", "", "");
        System.out.println(p1.FIO());
        System.out.println(p2.FIO());
        System.out.println(p3.FIO());
    }
}
