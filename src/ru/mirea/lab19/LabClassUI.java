package ru.mirea.lab19;
import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
        this.scanner = new Scanner(System.in);
    }
    public void menuLoop() {
        while (true) {
            System.out.println("1. Показать список всех студентов");
            System.out.println("2. Отсортировать студентов по среднему баллу");
            System.out.println("3. Найти студента по ФИО");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    printAll();
                    break;
                case "2":
                    labClass.sortStudents();
                    System.out.println("Список успешно отсортирован!");
                    printAll();
                    break;
                case "3":
                    searchScenario();
                    break;
                case "4":
                    System.out.println("Завершение работы.");
                    return;
                default:
                    System.out.println("Неверный пункт меню. Попробуйте еще раз.");
            }
        }
    }
    public void printAll(){
        for (Student s : labClass.getStudents()){
            System.out.println(s);
        }
    }
    public void searchScenario(){
        System.out.print("Введите ФИО для поиска: ");
        String name = scanner.nextLine();
        try{
            System.out.println(labClass.findStudent(name));
        }catch (StudentNotFoundException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
