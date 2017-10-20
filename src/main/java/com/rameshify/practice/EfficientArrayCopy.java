package com.rameshify.practice;

import java.util.Arrays;

public class EfficientArrayCopy {
    public static void main(String[] args) {
        int[] array = new int[200];
        int len = array.length;
        if (len > 0)
            array[0] = 1;
        for (int i = 1; i < len; i += i) {
            int k = (len - i);
            int copyLength = (k < i) ? k : i;
            System.out.println(String.format("Copy %2d element(s) from [0, %2d) to [%2d, %2d)", copyLength, copyLength, i, copyLength + i));
            System.arraycopy(array, 0, array, i, copyLength);
        }
    }

    public static void fill(int[] src, int val) {
        int n = src.length;
        if (n > 0)
            src[0] = val;
        for (int i = 1; i < n; i += i) {
            int r = (n - i);
            int length = (r < i) ? r : i;
            System.arraycopy(src, 0, src, i, length);
        }
    }
}