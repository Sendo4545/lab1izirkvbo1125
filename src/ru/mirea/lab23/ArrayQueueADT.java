package ru.mirea.lab23;
import java.util.Objects;

// Инвариант: adt != null и его внутренние поля elements != null, 0 <= size <= capacity
public class ArrayQueueADT {
    private static final int START_CAPACITY = 10;
    private Object[] elements = new Object[START_CAPACITY];
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    public static ArrayQueueADT create() {
        return new ArrayQueueADT();
    }

    // Предусловие: queue != null
    // Постусловие: результат — true, если size == 0, иначе false
    public static boolean isEmpty(ArrayQueueADT queue) {
        Objects.requireNonNull(queue, "Очередь не может быть null");
        return queue.size == 0;
    }

    // Предусловие: queue != null, element != null
    // Постусловие: элемент добавлен в конец указанной очереди, size увеличен на 1
    public static void enqueue(ArrayQueueADT queue, Object element){
        Objects.requireNonNull(queue, "Очередь не может быть null");
        Objects.requireNonNull(element, "Элемент не может быть null");
        queue.elements[queue.rear] = element;
        queue.rear = (queue.rear + 1) % queue.elements.length;
        queue.size ++;
    }

    // Предусловие: queue != null, queue.size > 0
    // Постусловие: результат — первый элемент очереди, состояние не изменилось
    public static Object element(ArrayQueueADT queue) {
        Objects.requireNonNull(queue, "Очередь не может быть null");
        if (isEmpty(queue)) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.elements[queue.front];
    }

    // Предусловие: queue != null, queue.size > 0
    // Постусловие: первый элемент удален и возвращен, size уменьшен на 1
    public static Object dequeue(ArrayQueueADT queue){
        Objects.requireNonNull(queue, "Очередь не может быть null");
        if (isEmpty(queue)) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object res = queue.elements[queue.front];
        queue.elements[queue.front] = null;
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;
        return res;
    }

    // Предусловие: queue != null
    // Постусловие: результат — текущее количество элементов
    public static int size(ArrayQueueADT queue) {
        Objects.requireNonNull(queue, "Очередь не может быть null");
        return queue.size;
    }

    // Предусловие: queue != null
    // Постусловие: очередь очищена, size = 0
    public static void clear(ArrayQueueADT queue){
        Objects.requireNonNull(queue, "Очередь не может быть null");
        queue.elements = new Object[START_CAPACITY];
        queue.size = 0;
        queue.front = 0;
        queue.rear = 0;
    }
    public static void ensureCapacity(ArrayQueueADT queue, int capacity){
        if (capacity <= queue.elements.length){
            return;
        }
        int newCapacity = queue.elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < queue.size; i++) {
            newElements[i] = queue.elements[(queue.front + i) % queue.elements.length];
        }
        queue.elements = new Object[newCapacity];
        queue.front = 0;
        queue.rear = 0;

    }
    public static void main(String[] args) {
        System.out.println("Тест 2: ArrayQueueADT");
        ArrayQueueADT adt = new ArrayQueueADT();
        ArrayQueueADT.enqueue(adt, "АДТ1");
        ArrayQueueADT.enqueue(adt, "АДТ2");
        System.out.println("Первый элемент: " + ArrayQueueADT.element(adt));
        System.out.println("Удален: " + ArrayQueueADT.dequeue(adt));
        ArrayQueueADT.clear(adt);
    }
}

