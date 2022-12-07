package com.codeashen.algorithm.linearsearch;

/**
 * 最基本的线性查找
 */
public class LinearSearch1 {

    private LinearSearch1() {
    }

    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
