package com.rameshify.practice.codility;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        System.out.println(new PermCheck().solution(new int[]{4, 1, 3, 2}));
    }

    public int solution(int A[]) {
        boolean notAPerm = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) {
                notAPerm = true;
                break;
            }
            if (A[Math.abs(A[i]) - 1] < 0) {
                notAPerm = true;
                break;
            } else {
                A[Math.abs(A[i]) - 1] = -A[Math.abs(A[i]) - 1];
            }
        }
        return notAPerm ? 0 : 1;
    }
}
