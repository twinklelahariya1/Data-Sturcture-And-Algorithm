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


