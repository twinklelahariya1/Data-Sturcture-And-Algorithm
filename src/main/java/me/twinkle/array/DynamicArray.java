package me.twinkle.array;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        new DynamicArray().run();
    }


    int index = 0;
    int[] array = new int[2];

    private void run() {

        array = addElement(5, array);
        array = addElement(6, array);
        array = addElement(2, array);
        array = addElement(4, array);
        array = addElement(8, array);

    }

    public int[] addElement(int value, int[] array) {
        if (index == array.length)
            array = growArray(array, index);

        array[index++] = value;
        return array;
    }

    public int[] growArray(int[] array, int index) {
        return Arrays.copyOf(array, index * 2);
    }
}
