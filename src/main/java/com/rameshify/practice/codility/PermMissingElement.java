package com.rameshify.practice.codility;

import java.math.BigInteger;
import java.util.Arrays;

public class PermMissingElement {
    public static void main(String[] args) {

        System.out.println(new PermMissingElement().solution(new int[]{3, 2, 1, 5}));
    }

    public int solution(int A[]) {
        int n = A.length;
        BigInteger a = BigInteger.valueOf(n+1);
        BigInteger b = BigInteger.valueOf(n+2);
        BigInteger expectedSum = a.multiply(b).divide(BigInteger.valueOf(2));
        for (int i = 0; i < n; i++) {
            expectedSum = expectedSum.subtract(BigInteger.valueOf(A[i]));
        }
        return expectedSum.intValue();
    }
}
