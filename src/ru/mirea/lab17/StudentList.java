package ru.mirea.lab17;

public class StudentList {

    public Student front;

    public StudentList(){
        this.front = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void addStudent(Student newStudent){
        if (newStudent == null){
            return;
        }
        if (isEmpty()){
            front = newStudent;
        }else{
            Student curr = front;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newStudent;
        }
        System.out.println("Студент добавлен в картотеку.");
    }

    public boolean removeStudent(String name){
        if (isEmpty()){
            return false;
        }
        if (front.getName().equalsIgnoreCase(name)){
            front = front.next;
            return true;
        }
        Student cur = front;
        while(cur.next != null){
            if (cur.next.getName().equalsIgnoreCase(name)){
                cur.next = cur.next.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public void clear(){
        front = null;
        System.out.println("Картотека очищена.");
    }

    public void display(String name){
        if (isEmpty()){
            System.out.println("Картотека пуста.");
            return;
        }
        Student cur = front;
        while (cur != null){
            if (cur.getName().equalsIgnoreCase(name)){
                cur.printToConsole();
                return;
            }
            cur = cur.next;
        }
        System.out.println("Студент не найден");
    }
}
