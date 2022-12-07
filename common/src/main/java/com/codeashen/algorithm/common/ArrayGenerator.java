package com.codeashen.algorithm.common;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ArrayGenerator {
    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
