package ru.mirea.lab23;
import java.util.Objects;

public class ArrayQueue {
    private static final int START_CAPACITY = 10;
    private Object[] elements;
    private int front;
    private int rear;
    private int size;

    // Постусловие: создан новый пустой экземпляр очереди
    public ArrayQueue() {
        this.elements = new Object[START_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Предусловие: element != null
    // Постусловие: элемент добавлен в конец указанной очереди, size увеличен на 1
    public void enqueue(Object element){
        Objects.requireNonNull(element, "Элемент не может быть null");
        this.elements[this.rear] = element;
        this.rear = (this.rear + 1) % this.elements.length;
        this.size++;
    }

    // Постусловие: результат — true, если size == 0, иначе false
    public boolean isEmpty(){
        return this.size == 0;
    }

    // Предусловие: size > 0
    // Постусловие: результат — первый элемент очереди, состояние не изменилось
    public Object element(){
        if(isEmpty()){
            throw new IllegalStateException("Очередь пуста");
        }
        return this.elements[this.front];
    }

    // Предусловие: size > 0
    // Постусловие: первый элемент удален и возвращен, size уменьшен на 1
    public Object dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Очередь пуста");
        }
        Object res = this.elements[this.front];
        this.elements[this.front] = null;
        this.front = (this.front + 1) % this.elements.length;
        this.size--;
        return res;
    }

    // Постусловие: результат — текущее количество элементов
    public int size(){
        return this.size;
    }

    // Постусловие: очередь очищена, size = 0
    public void clear(){
        this.elements = new Object[START_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    private void ensureCapacity(int capacity) {
        if (capacity <= this.elements.length) {
            return;
        }

        int newCapacity = this.elements.length * 2;
        Object[] newElements = new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            newElements[i] = this.elements[(this.front + i) % this.elements.length];
        }

        this.elements = newElements;
        this.front = 0;
        this.rear = this.size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue("Первый элемент");
        queue.enqueue("Второй элемент");
        queue.enqueue("Третий элемент");
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удален: " + queue.dequeue());
        queue.clear();
    }
}
