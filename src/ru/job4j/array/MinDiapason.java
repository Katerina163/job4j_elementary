package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        int i = 0;
        for (int index = start; index <= finish; index++) {
            if (min >= array[index]) {
                min = array[index];
                i = index;
            }
        }
        return i;
    }
}
