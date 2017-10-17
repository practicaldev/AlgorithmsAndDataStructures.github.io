package com.rameshify.practice;

public class AppleStocks {

	public static void main(String[] args) {
		int[] stockPrices = { 10, 7, 5, 8, 11, 9 };
		System.out.println(new AppleStocks().maxProfit(stockPrices));
	}

	private int maxProfit(int[] stockPrices) {
		if (stockPrices.length < 2) {
			throw new IllegalArgumentException("Minimum array size of 2 required.");
		}
		int minPrice = stockPrices[0];
		int maxProfit = stockPrices[1] - stockPrices[0];
		for (int i = 1; i < stockPrices.length; i++) {
			int currentPrice = stockPrices[i];

			maxProfit = Math.max(maxProfit, currentPrice - minPrice);
			minPrice = Math.min(minPrice, currentPrice);
		}
		return maxProfit;
	}
}