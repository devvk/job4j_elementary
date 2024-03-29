package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    /*
    Добавьте еще тест-методы с проверками:
        первое максимальное,
        второе максимальное,
        оба числа одинаковые
        (если оба одинаковые, то вернуть любое из этих чисел).
    */

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
}