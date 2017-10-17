package com.rameshify.practice;

import java.util.Scanner;

public class LeftArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        System.out.println(leftRotate(a, k));;
        int[] rightRotated = rightRotate(new int[]{}, k);
        System.out.println(rightRotated);;
    }

    private static int[] leftRotate(int[] a, int k) {
        int n = a.length;
        int b[] = new int[n];
        System.arraycopy(a, k, b, 0, n - k);
        System.arraycopy(a, 0, b, n - k, k);
        return b;
    }
    private static int[] rightRotate(int[] a, int k) {
        int n = a.length;
        int b[] = new int[n];
        System.arraycopy(a,0,b,k,n-k);
        System.arraycopy(a,n-k,b,0,k);
        return b;
    }
}
