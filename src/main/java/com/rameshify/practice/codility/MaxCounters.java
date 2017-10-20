package com.rameshify.practice.codility;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class MaxCounters {
    public static void main(String[] args) {
        System.out.println(new MaxCounters().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        boolean maxPending = false;
        int currentMax = 0;
        int prevMax = currentMax;
        for (int instruction : A) {
            if (instruction == N + 1) {
                if (maxPending) {
//                    for (int index = 0; index < N; index++)
//                        counters[index] = currentMax;
                    intfill(counters, currentMax);
                }
                maxPending = false;
            } else {
                prevMax = currentMax;
                int potentialMax = ++counters[instruction - 1];
                currentMax = prevMax >= potentialMax ? prevMax : potentialMax;
                if (prevMax != currentMax) {
                    maxPending = true;
                }
            }
        }
        return counters;
    }

    public void intfill(int[] array, int value) {
        int len = array.length;
        if (len > 0)
            array[0] = value;
        for (int i = 1; i < len; i += i)
            System.arraycopy( array, 0, array, i,
                    ((len - i) < i) ? (len - i) : i);
    }
}
