package ru.mirea.lab7;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean SpeedTest(){
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }
    @Override
    public void moveUp(){
        if (SpeedTest()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else{
            System.out.println("Скорости точек не совпадают!");
        }
    }
    @Override
    public void moveDown(){
        if (SpeedTest()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else{
            System.out.println("Скорости точек не совпадают!");
        }
    }
    @Override
    public void moveRight(){
        if (SpeedTest()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else{
            System.out.println("Скорости точек не совпадают!");
        }
    }
    @Override
    public void moveLeft(){
        if (SpeedTest()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else{
            System.out.println("Скорости точек не совпадают!");
        }
    }
    @Override
    public String toString(){
        return "Верхняя левая точка: " + topLeft.toString() + "\n Нижняя правая точка: " + bottomRight.toString();
    }

}
