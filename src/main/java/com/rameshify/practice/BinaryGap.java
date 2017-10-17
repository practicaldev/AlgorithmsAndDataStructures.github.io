package com.rameshify.practice;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(9));;
        System.out.println(new BinaryGap().solution(529));;
        System.out.println(new BinaryGap().solution(20));;
        System.out.println(new BinaryGap().solution(15));;
        System.out.println(new BinaryGap().solution(1041));;
    }

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int max=0;
        int currentMax = 0;
        boolean compute = false;
        for(int idx = 0;idx<binary.length();idx++){
            if(binary.charAt(idx)=='0'){
                currentMax++;
            }else{
                max = Math.max(currentMax,max);
                currentMax = 0;
            }
        }
        return max;
    }
}
