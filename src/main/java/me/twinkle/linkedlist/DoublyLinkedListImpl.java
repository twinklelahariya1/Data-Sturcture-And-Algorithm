package me.twinkle.linkedlist;

public class DoublyLinkedListImpl {

    private DoublyListNode head;

    private DoublyListNode tail;

    private int size;

    public void insertToFront(DoublyListNode node) {
        head.setPrevious(node);
        node.setNext(head);
        node.setPrevious(null);
        size++;
    }

    public void deleteFromFront(DoublyListNode node) {
        head = head.getNext();
        head.setPrevious(null);
        size--;

    }
}
