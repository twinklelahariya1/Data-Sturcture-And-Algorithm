package me.twinkle.queue;

import me.twinkle.listnode.ListNode;

public class LinkedListImpl<T> implements Queue<T> {

    ListNode<T> head;
    ListNode<T> counter;
    int size = 0;

    public LinkedListImpl() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(T value) {
        ListNode<T> valueNode = new ListNode<>(value);
        counter.setNext(valueNode);
        counter = valueNode;
        size++;
    }

    @Override
    public void pop() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }
}
