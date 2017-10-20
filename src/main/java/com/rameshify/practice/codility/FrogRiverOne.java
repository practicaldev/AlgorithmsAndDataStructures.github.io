package com.rameshify.practice.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
//        System.out.println(new FrogRiverOne().solution(5, new int[]{1,3,1,4,2,3,5,4}));
        System.out.println(new FrogRiverOne().solution(4, new int[]{1,3,1,4,2,3,5,4}));
    }

    int solution(int X, int A[]) {
        Set<Integer> leaves = new HashSet<>();
        for (int i = 1; i <= X; i++) {
            leaves.add(i);
        }
        for (int index = 0; index < A.length; index++) {
            int leaf = A[index];
            leaves.remove(leaf);
            if (leaves.isEmpty()) {
                return index;
            }
        }
        return -1;
    }
}
