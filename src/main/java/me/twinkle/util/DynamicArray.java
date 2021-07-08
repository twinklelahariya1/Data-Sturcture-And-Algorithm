package me.twinkle.util;

import java.util.Arrays;

public class DynamicArray<T> {

    public T[] growArray(T[] array, int size) {
        array = Arrays.copyOf(array, size * 2);
        return array;
    }
}
