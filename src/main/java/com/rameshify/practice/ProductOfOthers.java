package com.rameshify.practice;

public class ProductOfOthers {

	public static void main(String[] args) {
		int[] items = { 1, 7, 3, 4 };

		new ProductOfOthers().productOfOthers(items);
	}

	private int[] productOfOthers(int[] items) {
		if (items.length < 2) {
			throw new IllegalArgumentException("Product requires atleast two numbers.");
		}

		int[] productOfOthers = new int[items.length];

		int productSoFar = 1;

		for (int i = 0; i < items.length; i++) {
			productOfOthers[i] = productSoFar;
			productSoFar *= items[i];
		}
		
		productSoFar = 1;
		for (int i = items.length - 1; i >= 0; i--) {
			productOfOthers[i] = productOfOthers[i] * productSoFar;
			productSoFar *= items[i];
		}
		return productOfOthers;
	}

}
