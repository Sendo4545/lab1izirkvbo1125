package ru.mirea.lab24;

public class Client {
    public Chair chair;
    public void sit(Chair chair){
        this.chair = chair;
        System.out.print("Клиент сел на ");
        chair.display();
    }
    public void setChair(Chair chair){
        this.chair = chair;
    }
}
