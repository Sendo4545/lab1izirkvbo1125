package ru.mirea.lab28;

public class task3 {
    public static class Node{
        double key;
        String value;
        Node next;
        Node(double key, String value){
            this.key = key;
            this.value = value;
        }
    }
    private final Node[] table;
    private final int size;
    public task3(int cap){
        this.size = cap;
        this.table = new Node[cap];
    }
    private int hash(double key){
        int hashBits = Double.hashCode(key);
        return (Math.abs(hashBits)) % size;
    }
    public void put(double key, String value){
        int index = hash(key);
        for (Node cur = table[index];cur != null; cur = cur.next){
            if(Double.compare(cur.key,key)==0){
                cur.value=value;
                return;
            }
        }
        Node newNode = new Node(key,value);
        newNode.next = table[index];
        table[index] = newNode;
    }
    public String get(double key){
        int index = hash(key);
        for (Node cur = table[index];cur != null; cur = cur.next){
            if (Double.compare(cur.key,key) == 0){
                return cur.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        task3 testTable = new task3(3);
        testTable.put(3.14,"PI");
        testTable.put(2.718,"e");
        testTable.put(0.0,"0");
        System.out.println(testTable.get(3.14));
        System.out.println(testTable.get(2.718));
        System.out.println(testTable.get(0.0));
        testTable.put(0.0,"Ноль");
        System.out.println(testTable.get(0.0));
        System.out.println(testTable.get(4.2));
    }
}
