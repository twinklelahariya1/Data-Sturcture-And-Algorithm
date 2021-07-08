package me.twinkle.stack;

import me.twinkle.listnode.ListNode;

public class StackLinkedListImpl<T> implements Stack<T> {

    ListNode<T> head;
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(T value) {
        ListNode<T> valueNode = new ListNode<>(value);
        if (head == null) {
            head = valueNode;
            size++;
            return;
        }
        valueNode.setNext(head);
        head = valueNode;
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


