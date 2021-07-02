package me.twinkle.linkedlist;

public class DoublyListNode {

    private final int id;
    private DoublyListNode next;
    private DoublyListNode previous;

    public int getId() {
        return id;
    }

    public DoublyListNode getNext() {
        return next;
    }

    public void setNext(DoublyListNode next) {
        this.next = next;
    }

    public DoublyListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyListNode previous) {
        this.previous = previous;
    }

    public DoublyListNode(int id, DoublyListNode next, DoublyListNode previous) {
        this.id = id;
        this.next = next;
        this.previous = previous;
    }
}
