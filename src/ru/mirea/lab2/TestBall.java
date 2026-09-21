package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(1.0,2.0);
        System.out.println("Старт: " + ball);
        ball.move(5.5,-1.5);
        System.out.println("Движение: " + ball);
        ball.setXY(10,10);
        System.out.println("Перемещение: " + ball);
    }
}
