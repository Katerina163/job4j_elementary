package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        int result = a >= b ? a : b;
        return result;
    }
}
