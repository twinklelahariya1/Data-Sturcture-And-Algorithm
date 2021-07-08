package me.twinkle.queue;

import me.twinkle.util.DynamicArray;

public class ArrayImpl<T> implements Queue<T> {

    DynamicArray<T> dynamicArray = new DynamicArray<>();
    @SuppressWarnings("unchecked")
    T[] array = (T[]) new Object[10];
    int i = 0;
    int n = 0;

    public ArrayImpl() {
    }

    public int size() {
        return n;
    }

    @Override
    public void push(T value) {
        if (n == array.length) {
            array = dynamicArray.growArray(array, array.length);
        }
        array[n++] = value;
    }

    @Override
    public void pop() {
        array[--i] = null;
    }
}
