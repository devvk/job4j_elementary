package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayWithoutEvenElementsTest {
    @Test
    public void changeData() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] rsl = ArrayWithoutEvenElements.changeData(data);
        int[] expected = {1, 3, 5, 7, 9};
        assertThat(rsl, is(expected));
    }
}
