package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by35() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 5};
        int[] rsl = machine.change(100, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by17() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 2, 1};
        int[] rsl = machine.change(50, 17);
        assertThat(rsl, is(expected));
    }
}