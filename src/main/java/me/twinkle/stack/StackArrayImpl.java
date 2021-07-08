package me.twinkle.stack;

import me.twinkle.util.DynamicArray;

public class StackArrayImpl<T> implements Stack<T> {

    DynamicArray<T> dynamicArray = new DynamicArray<>();

    @SuppressWarnings("unchecked")
    T[] stack = (T[]) new Object[10];

    Integer index = 0;

    @Override
    public int size() {
        return index;
    }

    @Override
    public void push(T value) {
        if (index == stack.length)
            stack = dynamicArray.growArray(stack, index);
        stack[index++] = value;

    }

    @Override
    public void pop() {
        if (index != 0) {
            stack[--index] = null;
        }
    }
}
