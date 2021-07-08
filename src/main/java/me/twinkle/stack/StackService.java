package me.twinkle.stack;

public class StackService {
    public static void main(String[] args) {

        new StackService().arrayImpl();
        new StackService().linkedListImpl();

    }

    private void linkedListImpl() {
        Stack<Integer> stackLinkedList = new StackLinkedListImpl<>();
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.pop();
        System.out.println(stackLinkedList.size());
        stackLinkedList.push(6);
        stackLinkedList.push(8);
        stackLinkedList.pop();
        stackLinkedList.push(9);
        stackLinkedList.pop();
        System.out.println(stackLinkedList.size());

    }

    private void arrayImpl() {
        Stack<Integer> stackArray = new StackArrayImpl<>();
        stackArray.push(3);
        stackArray.push(4);
        stackArray.pop();
        System.out.println(stackArray.size());
        stackArray.push(6);
        stackArray.push(8);
        stackArray.pop();
        stackArray.push(9);
        stackArray.pop();
        System.out.println(stackArray.size());
    }

}
