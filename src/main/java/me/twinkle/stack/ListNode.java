package me.twinkle.stack;

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
