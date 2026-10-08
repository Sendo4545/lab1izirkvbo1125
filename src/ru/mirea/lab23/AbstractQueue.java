package ru.mirea.lab23;

public abstract class AbstractQueue implements Queue{
    int size = 0;

    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public abstract void enqueue(Object element);
    @Override
    public abstract Object dequeue();
    @Override
    public abstract Object element();
    @Override
    public abstract void clear();
}
