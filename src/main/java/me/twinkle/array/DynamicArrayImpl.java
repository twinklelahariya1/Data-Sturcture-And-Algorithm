package me.twinkle.array;

import me.twinkle.util.DynamicArray;

public class DynamicArrayImpl {
    public static void main(String[] args) {
        new DynamicArrayImpl().run();
    }

    DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
    int index = 0;
    Integer[] array = new Integer[2];

    private void run() {

        array = addElement(5, array);
        array = addElement(6, array);
        array = addElement(2, array);
        array = addElement(4, array);
        array = addElement(8, array);

    }

    public Integer[] addElement(int value, Integer[] array) {
        if (index == array.length)
            array = dynamicArray.growArray(array, index);

        array[index++] = value;
        return array;
    }
}
