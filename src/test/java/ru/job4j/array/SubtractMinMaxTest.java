package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SubtractMinMaxTest {
    @Test
    public void calculateIs18() {
        int[] ints = {10, 15, 20, 2, 10, 6};
        int rsl = SubtractMinMax.calculate(ints);
        assertThat(rsl, is(18));
    }

    @Test
    public void calculateIs24() {
        int[] ints = {-3, 4, -9, -1, -2, 15};
        int rsl = SubtractMinMax.calculate(ints);
        assertThat(rsl, is(24));
    }
}