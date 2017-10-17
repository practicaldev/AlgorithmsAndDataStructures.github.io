package com.rameshify.practice;

public class Decimal2Binary {
	public static void main(String[] args) {
		long i = Integer.MIN_VALUE;
		String binary = toBinary(i);
		System.out.println(i +" in binary is "+binary);
		int length = binary.length();
		if(i<0){
			length -= 1;
		}
		System.out.println(i +"(Integer) is "+length+" bits and "+(Math.ceil(((double)length/8)))+" byte(s) long");
	}

	private static String toBinary(long decimal) {
		long quotient = decimal;
		if (quotient == 0 || quotient == 1) {
			return ""+quotient;
		}
		String binary = "";
		while (quotient != 0) {
			long remainder = quotient % 2;
			binary = remainder + binary;
			quotient /= 2;
		}
		return binary;
	}
}
