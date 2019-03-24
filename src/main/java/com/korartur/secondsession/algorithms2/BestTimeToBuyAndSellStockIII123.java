package com.korartur.secondsession.algorithms2;

public class BestTimeToBuyAndSellStockIII123 {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;

        int res = 0;

        int[] leftToRight = new int[prices.length];
        int[] rightToLeft =  new int[prices.length];


        int min1 = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < min1){
                min1 = prices[i];
            }

            leftToRight[i] = Math.max(prices[i] - min1, leftToRight[i-1]);
        }

        int max1 = prices[prices.length-1];
        for(int i = prices.length-2; i >= 0; i--){
            if(prices[i] > max1){
                max1 = prices[i];
            }

            rightToLeft[i] = Math.max(max1 - prices[i], rightToLeft[i+1]);
        }

        res = Math.max(leftToRight[prices.length-1], rightToLeft[0]);

        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, leftToRight[i-1] + rightToLeft[i]);
        }


        return res;
    }
}
