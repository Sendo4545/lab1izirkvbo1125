package ru.mirea.lab23;

public class LinkedQueue implements Queue{
    private static class Node{
        Object value;
        Node next;

        Node(Object value){
            this.value = value;
            this.next = null;
        }
    }
    private Node front = null;
    private Node rear = null;
    private int size = 0;
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void enqueue(Object element){
        if (isEmpty()){
            throw new IllegalStateException("Очередь пуста");
        }
        Node newNode = new Node(element);
        if (rear == null){
            front = newNode;
            rear = newNode;
        } else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    @Override
    public Object element(){
        if (isEmpty()){
            throw new IllegalStateException("Очередь пуста");
        }
        return front.value;
    }
    @Override
    public Object dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Очередь пуста");
        }
        Object res = front.value;
        front = front.next;
        if (front == null){
            rear = null;
        }
        size --;
        return res;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void clear(){
        front = null;
        rear = null;
        size = 0;
    }
}
