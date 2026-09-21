package ru.mirea.lab2;

public class Tester {
    private Circle[] circles;
    private int count;
    public Tester(int cap) {
        this.circles = new Circle[cap];
        this.count = 0;
    }
    public void add(Circle c){
        if (count < circles.length){
            circles[count] = c;
            count++;
        }
    }
    public void printCircles() {
        System.out.println("Количество элементов в массиве = " + count);
        for (int i = 0; i < count; i++) {
            System.out.println("Окружность [" + i + "]: " + circles[i]);
        }
    }
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.add(new Circle(new Point(0, 0), 5.5));
        tester.add(new Circle(new Point(2, 3), 10.0));

        tester.printCircles();
    }
}
