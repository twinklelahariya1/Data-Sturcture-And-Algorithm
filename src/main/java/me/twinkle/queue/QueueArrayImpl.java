package me.twinkle.queue;

import me.twinkle.util.DynamicArray;

public class QueueArrayImpl<T> implements Queue<T> {

    DynamicArray<T> dynamicArray = new DynamicArray<>();
    @SuppressWarnings("unchecked")
    T[] array = (T[]) new Object[10];
    int i = 0;
    int n = 0;
    int size = 0;

    public QueueArrayImpl() {
    }

    public int size() {
        return size;
    }

    @Override
    public void enQueue(T value) {
        if (n == array.length) {
            array = dynamicArray.growArray(array, array.length);
        }
        array[n++] = value;
        size++;
    }

    @Override
    public T deQueue() {
        T val = array[i];
        array[i] = null;
        i++;
        size--;
        return val;
    }
}
