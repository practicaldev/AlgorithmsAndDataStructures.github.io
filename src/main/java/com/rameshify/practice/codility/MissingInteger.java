package com.rameshify.practice.codility;

public class MissingInteger {
    public static void main(String[] args) {
        System.out.println(new MissingInteger().solution(new int[]{1}));
        System.out.println(new MissingInteger().solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(new MissingInteger().solution(new int[]{1, 2, 3}));
        System.out.println(new MissingInteger().solution(new int[]{-1, -3}));
//        System.out.println(new MissingInteger().solution(new int[]{4}));
        System.out.println(new MissingInteger().solution(new int[]{2}));
    }

    public int solution(int[] A) {
        boolean[] smallest = new boolean[A.length];
        for (int i : A) {
            if (i > 0 && i <= A.length) {
                smallest[i - 1] = true;
            }
        }
        for (int i = 0; i < smallest.length; i++) {
            boolean b = smallest[i];
            if (!b) {
                return i + 1;
            }
        }
        return smallest.length + 1;
    }
}
