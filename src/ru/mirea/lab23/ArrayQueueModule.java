package ru.mirea.lab23;

import java.util.Objects;

// Инвариант:
// elements != null
// 0 <= size <= elements.length
// Если size == 0, то очередь пуста.
public class ArrayQueueModule {
    private static int size = 0;
    private static int front = 0;
    private static int rear = 0;
    private static Object[] elements = new Object[4];

    // Постусловие: результат — true, если size == 0, иначе false
    public static boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: element != null
    // Постусловие: элемент добавлен в конец указанной очереди, size увеличен на 1
    public static void enqueue(Object element){
        Objects.requireNonNull(element, "Элемент не может быть null");
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    // Предусловие: size > 0
    // Постусловие: результат — первый элемент очереди, состояние не изменилось
    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[front];
    }

    // Постусловие: результат — текущее количество элементов
    public static int size() {
        return size;
    }

    // Предусловие: size > 0
    // Постусловие: первый элемент удален и возвращен, size уменьшен на 1
    public static Object dequeue(){
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object res = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return res;
    }

    // Постусловие: очередь очищена, size = 0
    public static void clear() {
        size = 0;
        front = 0;
        elements = new Object[4];
    }

    public static void ensureCapacity(int capacity){
        if (capacity <= elements.length) {
            return;
        }
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(front + i) % elements.length];
        }
        elements = newElements;
        front = 0;
        rear = size;
    }

    public static void main(String[] args) {
        System.out.println("Тест 1: ArrayQueueModule");
        ArrayQueueModule.enqueue("Модуль1");
        ArrayQueueModule.enqueue("Модуль2");
        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удален: " + ArrayQueueModule.dequeue());
        System.out.println("Оставшийся размер: " + ArrayQueueModule.size());
        ArrayQueueModule.clear();
    }
}
