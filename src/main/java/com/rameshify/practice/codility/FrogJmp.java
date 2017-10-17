package com.rameshify.practice.codility;

import java.math.BigInteger;

public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10,85,30));
    }

    int solution(int X, int Y, int D){
        int minJumps = BigInteger.valueOf(Y).subtract(BigInteger.valueOf(X)).divide(BigInteger.valueOf(D)).intValue();
        int remainder = BigInteger.valueOf(Y).subtract(BigInteger.valueOf(X)).remainder(BigInteger.valueOf(D)).intValue();
        if(remainder==0){
            return minJumps;
        }
        return minJumps+1;
    }
}
