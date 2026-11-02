package ru.mirea.lab27;

public class hashtab {
    static class Node {
        String key;
        String value;
        Node next;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static class HashTable {
        private Node[] buckets;
        private int capacity;

        public HashTable(int capacity) {
            this.capacity = capacity;
            this.buckets = new Node[capacity];
        }
    }

    public static int hashtabHash(String key, int length) {
        if (key == null) {
            return 0;
        } else {
            return Math.abs(key.hashCode() % length);
        }

    }

    public static HashTable hashtabInit(int capacity) {
        return new HashTable(capacity);
    }

    public static void hashtabAdd(HashTable table, String key, String value) {
        if (table == null || key == null) {
            return;
        }
        int index = hashtabHash(key, table.capacity);
        Node head = table.buckets[index];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = table.buckets[index];
        table.buckets[index] = newNode;
    }

    public static String hashtabLookup(HashTable table, String key) {
        if (table == null || key == null) return null;
        int index = hashtabHash(key, table.capacity);
        Node head = table.buckets[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public static boolean hashtabDelete(HashTable table, String key) {
        if (table == null || key == null) return false;
        int index = hashtabHash(key, table.capacity);
        Node head = table.buckets[index];
        Node prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    table.buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return true;
            }
            prev = head;
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        HashTable testDict = hashtabInit(5);
        hashtabAdd(testDict, "apple", "fruit");
        hashtabAdd(testDict, "tomato", "vegetable");
        hashtabAdd(testDict, "chicken", "meat");
        hashtabAdd(testDict, "salmon", "fish");
        hashtabAdd(testDict, "milk", "dairy");
        hashtabAdd(testDict, "bread", "bakery");
        hashtabAdd(testDict, "water", "beverage");
        hashtabAdd(testDict, "coffee", "beverage");
        hashtabAdd(testDict, "cheese", "dairy");
        hashtabAdd(testDict, "potato", "vegetable");
        System.out.println(hashtabLookup(testDict, "apple"));
        System.out.println(hashtabLookup(testDict, "coffee"));
        System.out.println(hashtabLookup(testDict, "pizza"));
        boolean deleted1 = hashtabDelete(testDict, "tomato");
        System.out.println(deleted1 ? "Успешно удалено." : "Не найдено.");
        System.out.println("Поиск 'tomato' после удаления: " + hashtabLookup(testDict, "tomato"));
        System.out.print("Повторное удаление 'tomato': ");
        boolean deleted2 = hashtabDelete(testDict, "tomato");
        System.out.println(deleted2 ? "Успешно." : "Элемент не найден");
    }
}
