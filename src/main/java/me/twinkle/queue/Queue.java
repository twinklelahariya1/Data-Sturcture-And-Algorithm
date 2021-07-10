package me.twinkle.queue;

public interface Queue<T> {

    int size();

    void enQueue(T value);

    T deQueue();
}
