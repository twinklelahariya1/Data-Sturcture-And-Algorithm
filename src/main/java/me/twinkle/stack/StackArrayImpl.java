package me.twinkle.stack;

import me.twinkle.array.DynamicArray;

public class StackArrayImpl {

    int[] stack = new int[10];

    Integer index = 0;

    public static void main(String[] args) {

        new StackArrayImpl().run();
    }

    private void run() {
        stack = push(2);
        stack = push(3);
        stack = push(24);
        index = pop_();
        stack = push(25);
        stack = push(5);
        index = pop_();
        stack = push(6);
        index = pop_();

    }

    private int pop_() {
        if (index == 0)
            return -1;
        else {
            System.out.println(stack[--index]);
            stack[index] = -1;
            return index;
        }
    }

    private int[] push(int value) {
        DynamicArray dynamicArray = new DynamicArray();
        if (index == stack.length)
            stack = dynamicArray.growArray(stack, index);
        else
            stack[index++] = value;
        return stack;
    }
}
