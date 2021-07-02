package me.twinkle.linkedlist;

public class DoublyLinkedListRunner {

    public static void main(String[] args) {

        DoublyListNode node1 = new DoublyListNode(1, null, null);
        DoublyListNode node2 = new DoublyListNode(2, null, null);
        DoublyListNode node3 = new DoublyListNode(3, null, null);
        DoublyListNode node4 = new DoublyListNode(4, null, null);
        DoublyListNode node5 = new DoublyListNode(5, null, null);

        DoublyLinkedListImpl doublyLinkedList = new DoublyLinkedListImpl();

        doublyLinkedList.insertToFront(node1);
        doublyLinkedList.insertToFront(node2);
        doublyLinkedList.insertToEnd(node3);
        doublyLinkedList.insertToEnd(node5);
        doublyLinkedList.insertToEnd(node4);

        doublyLinkedList.deleteFromEnd();
        doublyLinkedList.deleteFromFront();

        System.out.println("Size: " + doublyLinkedList.printList());
    }
}
