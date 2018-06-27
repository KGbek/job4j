package ru.job4j.maximum;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maximum = new Max();
        int result = maximum.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMaxIsFromThreeNumber() {
        Max maximum = new Max();
        int result = maximum.max(3, 4, 5);
        assertThat(result, is(5));
    }
}
