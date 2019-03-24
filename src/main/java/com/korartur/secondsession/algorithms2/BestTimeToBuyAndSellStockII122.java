package com.korartur.secondsession.algorithms2;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.RecursiveTask;

public class BestTimeToBuyAndSellStockII122 {
    public int maxProfit(int[] prices) {
        Arrays.sort(new Integer[]{1,23,45}, (a,b) -> b - a);
        int res = 0;

        int min = -1;
        int max = -1;

        for(int i = 0; i < prices.length; i++){
            if(min == -1){
                min = prices[i];
            }
            else if(max == -1){
                if(prices[i] < min){
                    min = prices[i];
                }
                else{
                    max = prices[i];
                }
            }
            else if(prices[i] > max){
                max = prices[i];
            }
            else{
                res += max - min;
                min = prices[i];
                max = -1;
            }
        }

        if(max > min){
            res += max - min;
        }

        return res;
    }
}
