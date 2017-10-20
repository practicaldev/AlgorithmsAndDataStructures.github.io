package com.rameshify.practice;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class AppleStocks {

    public static void main(String[] args) {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        System.out.println(new AppleStocks().maxProfit(stockPrices)==new AppleStocks().maxProfit8(stockPrices));
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

    private int maxProfit8(int[] stockPrices) {
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Minimum array size of 2 required.");
        }
        final PriceProfit priceProfit = new PriceProfit();
        priceProfit.minPrice = stockPrices[0];
        priceProfit.maxProfit = stockPrices[1] - stockPrices[0];
        IntStream.range(1, stockPrices.length).forEach(index -> {
                priceProfit.maxProfit = Math.max(priceProfit.maxProfit, stockPrices[index] - priceProfit.minPrice);
                priceProfit.minPrice = Math.min(priceProfit.minPrice, stockPrices[index]);
        });
        return priceProfit.maxProfit;
    }

    class PriceProfit {
        int minPrice;
        int maxProfit;
    }
}