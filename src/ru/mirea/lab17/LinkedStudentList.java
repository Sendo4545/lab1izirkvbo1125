package ru.mirea.lab17;

public class LinkedStudentList {
    public StudentLinked front;
    public StudentLinked rear;

    public LinkedStudentList(){
        this.front = null;
        this.rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void addStudent(StudentLinked newStudent){
        if (newStudent == null){
            return;
        }
        if (isEmpty()){
            front = newStudent;
            rear = newStudent;
            newStudent.next = null;
            newStudent.prev = null;
        }else{
            rear.next = newStudent;
            newStudent.prev = rear;
            rear = newStudent;
            rear.next = null;
        }
        System.out.println("Студент добавлен в  картотеку.");
    }
    public boolean removeStudent(String name){
        if (isEmpty()){
            return false;
        }
        StudentLinked cur = front;
        while (cur != null){
            if(cur.getName().equalsIgnoreCase(name)){
                if (cur == front && cur == rear){
                    front = null;
                    rear = null;
                }
                else if (cur == front){
                    front = front.next;
                    front.prev = null;
                }
                else if (cur == rear){
                    rear = rear.prev;
                    rear.next = null;
                }
                else{
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public void clear(){
        front = null;
        rear= null;
        System.out.println("Картотека очищена.");
    }
    public void display(String name){
        if (isEmpty()) {
            System.out.println("Картотека пуста.");
            return;
        }
        StudentLinked cur = front;
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
