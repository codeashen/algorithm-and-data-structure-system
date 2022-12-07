package com.codeashen.algorithm.linearsearch;

import com.codeashen.algorithm.common.annotation.Algorithm;
import com.codeashen.algorithm.common.util.ArrayGenerator;
import com.google.common.base.Stopwatch;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Algorithm(value = "线性查找法", pref = "泛型")
public class LinearSearch2 {

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100_000;
        Integer[] data = ArrayGenerator.generateOrderedArray(n);

        Stopwatch stopwatch = Stopwatch.createStarted();
        LinearSearch2.search(data, n);
        stopwatch.stop();

        System.out.printf("执行时长: %s 毫秒", stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}
