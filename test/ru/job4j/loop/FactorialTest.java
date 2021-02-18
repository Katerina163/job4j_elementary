package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = Factorial.calc(5);
        assertThat(in, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = Factorial.calc(0);
        assertThat(in, is(1));
    }
}