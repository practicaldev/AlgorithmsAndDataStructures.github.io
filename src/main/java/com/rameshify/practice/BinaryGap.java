package com.rameshify.practice;

import java.util.stream.IntStream;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(9) == new BinaryGap().solution8(9));;
        System.out.println(new BinaryGap().solution(529) == new BinaryGap().solution8(529));;
        System.out.println(new BinaryGap().solution(20) == new BinaryGap().solution8(20));;
        System.out.println(new BinaryGap().solution(15) == new BinaryGap().solution8(15));;
        System.out.println(new BinaryGap().solution(1041) == new BinaryGap().solution8(1041));;
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
        }//855-324-9212 x523520
        return max;
    }
    public int solution8(int N) {
        String binary = Integer.toBinaryString(N);
        final Max max = new Max();
        max.value=0;
        max.current = 0;
        boolean compute = false;
        IntStream.range(0, binary.length()).forEach(idx->{
            if(binary.charAt(idx)=='0'){
                max.current++;
            }else{
                max.value = Math.max(max.current,max.value);
                max.current = 0;
            }
        });
        return max.value;
    }

    class Max {
        int current;
        int value;
    }
}
