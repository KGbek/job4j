package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        boolean sorted = true;
        for (int i = array.length - 1; i >= 2; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return array;
    }
}
