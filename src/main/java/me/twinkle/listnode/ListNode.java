package me.twinkle.listnode;

public class ListNode<T> {
    private final T number;
    private ListNode<T> next;

    public ListNode(T number) {
        this.number = number;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }
}
