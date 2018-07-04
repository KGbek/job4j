package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {1, 6, 4, 2, 3, 9, 7, 8, 0, 5};
        bubbleSort.sort(input);
        int[] expectArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(input, is(expectArray));

    }

    @Test
    public void whenSortArray2() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {10, 50, 30, 20, 60, 25, 40, 70, 90, 80};
        bubbleSort.sort(input);
        int[] expectArray = {10, 20, 25, 30, 40, 50, 60, 70, 80, 90};
        assertThat(input, is(expectArray));
    }
}
