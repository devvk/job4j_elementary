package ru.job4j.array;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoopForArrayTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        LoopForArray.main(null);
        String ln = System.lineSeparator();
        String expected = "2" + ln + "3" + ln + "4" + ln + "5" + ln;
        assertThat(out.toString(), is(expected));
    }
}
