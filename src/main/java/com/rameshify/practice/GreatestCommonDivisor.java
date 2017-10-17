package com.rameshify.practice;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println("Answer (GCD): "+new GreatestCommonDivisor().findGcd(75, 100));
	}

	/**
	 * Compute greatest common divisor of x and y
	 * @param x
	 * @param y
	 * @return gcd
	 */
	public Long findGcd(long x, long y) {
		long remainder = x % y;
		if (remainder == 0)
			return y;
		x = y;
		y = remainder;
		return findGcd(x, y);
	}
}
