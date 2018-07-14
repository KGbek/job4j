package ru.job4j;

import org.junit.Test;
import ru.job4j.array.ArrayDuplicate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;

public class ArrayDuplicateTest {

    @Test
    public void whenArrayHasDuplicatesThenDropIt() {
        String[] input = {"Almaz", "Bektur", "Vladimir", "Bektur", "Nurlan"};
        String[] expect = {"Almaz", "Bektur", "Vladimir", "Nurlan"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

    @Test
    public void whenArrayHasAllTheNumbers() {
        String[] input = {"7", "2", "3", "2", "4", "1", "5", "6", "1"};
        String[] expect = {"1", "2", "3", "4", "5", "6", "7"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
