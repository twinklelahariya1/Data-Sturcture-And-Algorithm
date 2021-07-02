package me.twinkle.linkedlist;

public class DoublyLinkedListImpl {

    private DoublyListNode head;

    private DoublyListNode tail;

    private int size = 0;

    public void insertToFront(DoublyListNode node) {
        head.setPrevious(node);
        node.setNext(head);
        size++;
    }

    public void deleteFromFront(DoublyListNode node) {
        head = head.getNext();
        head.setPrevious(null);
        size--;

    }

    public void insertToEnd(DoublyListNode node) {
        tail.setNext(node);
        node.setPrevious(tail);
        size++;
    }

    public void deleteFromEnd(DoublyListNode node) {
        tail = tail.getPrevious();
        tail.setNext(null);
        size--;
    }
}
