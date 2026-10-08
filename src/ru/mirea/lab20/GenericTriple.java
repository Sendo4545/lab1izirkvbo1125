package ru.mirea.lab20;

import java.io.Serializable;

public class GenericTriple <T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T T;
    private V V;
    private K K;
    public GenericTriple(T T, V V, K K){
        this.T = T;
        this.V = V;
        this.K = K;
    }
    public T getT() { return T; }
    public V getV() { return V; }
    public K getK() { return K; }
    public void PrintClasses(){
        System.out.println(T.getClass().getName());
        System.out.println(V.getClass().getName());
        System.out.println(K.getClass().getName());
    }
}
