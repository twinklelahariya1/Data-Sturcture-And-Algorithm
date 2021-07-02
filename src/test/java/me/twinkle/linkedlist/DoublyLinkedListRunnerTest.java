package me.twinkle.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoublyLinkedListRunnerTest {

    DoublyLinkedListImpl doublyLinkedList = new DoublyLinkedListImpl();

    DoublyListNode node1;
    DoublyListNode node2;
    DoublyListNode node3;
    DoublyListNode node4;
    DoublyListNode node5;

    @BeforeEach
    void setup() {
        node1 = new DoublyListNode(1, null, null);
        node2 = new DoublyListNode(2, null, null);
        node3 = new DoublyListNode(3, null, null);
        node4 = new DoublyListNode(4, null, null);
        node5 = new DoublyListNode(5, null, null);
    }

    @Test
    void main() {
        doublyLinkedList.insertToEnd(node1);
        Assertions.assertEquals(doublyLinkedList.printList(), 1);
    }
}