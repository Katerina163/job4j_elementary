package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when22to44then282() {
        double expected = 2.82;
        int x1 = 2;
        int y1 = 2;
        int x2 = 4;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when11to33then282() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when22to66then565() {
        double expected = 5.65;
        int x1 = 2;
        int y1 = 2;
        int x2 = 6;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}