package me.twinkle.queue;

public class ArrayImpl<T> implements Queue<T> {

    @SuppressWarnings("unchecked")
    T[] ts = (T[]) new Object[10];
    int n = 0;

    public ArrayImpl() {
    }

    @Override
    public void push(T value) {
    }

    @Override
    public void pop() {

    }
}
