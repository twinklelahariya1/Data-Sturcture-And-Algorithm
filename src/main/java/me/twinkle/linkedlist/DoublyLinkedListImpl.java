package me.twinkle.linkedlist;

public class DoublyLinkedListImpl {

    private DoublyListNode head;

    private DoublyListNode tail;

    private int size = 0;

    public void insertToFront(DoublyListNode node) {
        node.setNext(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void deleteFromFront() {
        head = head.getNext();
        head.setPrevious(null);
        size--;
    }

    public void insertToEnd(DoublyListNode node) {
        node.setPrevious(tail);
        if (tail == null)
            head = node;
        else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public void deleteFromEnd() {
        tail = tail.getPrevious();
        tail.setNext(null);
        size--;
    }

    public int printList() {
        DoublyListNode pointer = head;
        while (pointer != null) {
            System.out.println(pointer.getId());
            pointer = pointer.getNext();
        }
        return size;
    }
}
