package me.twinkle.stack;

public class StackLinkedListImpl {
    public static void main(String[] args) {

        new StackLinkedListImpl().run();

    }

    ListNode head = new ListNode(-1);

    private void run() {


        push(3);
        push(4);
        System.out.println(pop_());
        push(6);
        push(8);
        System.out.println(pop_());
        push(9);
        System.out.println(pop_());

    }

    private int pop_() {
        if (head == null || head.getNumber() == -1)
            return -1;
        else {
            int val = head.getNumber();
            head = head.getNext();
            return val;
        }
    }

    private void push(int value) {
        ListNode valueNode = new ListNode(value);
        valueNode.setNext(head);
        head = valueNode;
    }
}


class ListNode {
    private final int number;
    private ListNode next;

    public ListNode(int number) {
        this.number = number;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getNumber() {
        return number;
    }
}