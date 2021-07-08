package me.twinkle.queue;

public interface Queue<T> {

    int size();

    void push(T value);

    void pop();
}
