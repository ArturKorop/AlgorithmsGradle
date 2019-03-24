package com.korartur.secondsession.algorithms2;

public class BestTimeTOBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int min = prices[0];

        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            if(min > prices[i]){
                min = prices[i];
            }
            else if(prices[i] - min > res){
                res = prices[i] - min;
            }
        }

        return res;
    }
}
