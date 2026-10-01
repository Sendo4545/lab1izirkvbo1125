package ru.mirea.lab7;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle test = new MovableRectangle(0,10,5,0,2,3);
        System.out.println(test);
        System.out.println(test.SpeedTest());
        test.moveUp();
        test.moveRight();
        System.out.println(test);
    }
}
