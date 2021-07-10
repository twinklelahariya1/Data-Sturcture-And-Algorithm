package me.twinkle.queue;

import me.twinkle.listnode.ListNode;

public class QueueLinkedListImpl<T> implements Queue<T> {

    ListNode<T> head;
    int size = 0;

    public QueueLinkedListImpl() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enQueue(T value) {

        ListNode<T> valueNode = new ListNode<>(value);
        if (head == null) {
            head = valueNode;
            size++;
            return;
        }
        ListNode<T> counter = head;
        while (counter != null && counter.getNext() != null) {
            counter = counter.getNext();
        }
        counter.setNext(valueNode);
        size++;
    }

    @Override
    public T deQueue() {
        if (head != null) {
            T val = head.getNumber();
            head = head.getNext();
            size--;
            return val;
        }
        return null;
    }
}
