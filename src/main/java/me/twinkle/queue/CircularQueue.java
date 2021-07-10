package me.twinkle.queue;

public class CircularQueue {

    int[] data;
    int front;
    int tail;
    int capacity;
    
    public CircularQueue(int k) {
        data = new int[k];
        front = 0;
        tail = -1;
        capacity = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        tail++;
        data[tail % data.length] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        front++;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return data[front % data.length];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return data[tail % data.length];
    }

    public boolean isEmpty() {
        return front - tail > 0;
    }

    public boolean isFull() {

        return tail - front + 1 == capacity;
    }
}
