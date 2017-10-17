package com.rameshify.practice;

import java.util.HashSet;
import java.util.Set;

public class NoPairElement {

    public static void main(String[] args) {
        System.out.println(new NoPairElement().solution(new int[]{9,3,9,3,9,7,9}));
    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> items = new HashSet<>();
        for (int a : A) {
            {
                if (!items.add(a)) {
                    items.remove(a);
                }
            }
        }
        return items.iterator().next();
    }
}
