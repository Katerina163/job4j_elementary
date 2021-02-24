package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) { //сортировка слиянием
        int n = left.length + right.length;
        int[] arr = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == left.length) {
                arr[i] = right[i2++];
            } else if (i2 == right.length) {
                arr[i] = left[i1++];
            } else {
                if (left[i1] < right[i2]) {
                    arr[i] = left[i1++];
                } else {
                    arr[i] = right[i2++];
                }
            }
        }
        return arr;
    }
}
