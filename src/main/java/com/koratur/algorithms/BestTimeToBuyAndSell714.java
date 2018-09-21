package com.koratur.algorithms;

public class BestTimeToBuyAndSell714 {
    public int maxProfit(int[] prices, int fee) {

        int l = prices.length;
        if(l < 1) return 0;

       int cash = 0;
       int hold = -prices[0];

       for(int i = 1; i < prices.length; i++){
           int temp = hold;
           hold = Math.max(hold, cash - prices[i]);
           cash = Math.max(cash, prices[i] + temp - fee);
       }

       return cash;


    }
}
