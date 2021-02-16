package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxaThena() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxbThenb() {
        int result = Max.max(2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenNoMaxThena() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }
}