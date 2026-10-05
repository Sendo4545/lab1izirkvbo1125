package ru.mirea.lab21;

public class AnyType<E> {
    private Object[] elements;
    private int size;

    public AnyType(int cap){
        this.size = 0;
        this.elements = new Object[cap];
    }
    public void addElement(E element){
        if (size < elements.length){
            elements[size] = element;
            size ++;
        }else{
            System.out.println("Массив полон");
        }
    }
    public E getElement(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Неверный индекс");
        }
        else{
            return (E) elements[index];
        }

    }
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        AnyType<Integer> intHolder = new AnyType<>(5);
        intHolder.addElement(100);
        intHolder.addElement(200);
        intHolder.addElement(300);
        intHolder.addElement(400);
        intHolder.addElement(500);
        System.out.println(intHolder.getElement(2));
        AnyType<String> stringHolder = new AnyType<>(4);
        stringHolder.addElement("Один");
        System.out.println(stringHolder.getElement(0));
    }
}

