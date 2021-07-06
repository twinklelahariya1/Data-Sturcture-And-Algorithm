package me.twinkle.queue;

public interface Queue<T> {

    void push(T value);

    void pop();
}
