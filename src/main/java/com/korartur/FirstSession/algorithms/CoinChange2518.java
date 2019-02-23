package com.korartur.FirstSession.algorithms;

import java.util.Arrays;

public class CoinChange2518 {

    public int change(int amount, int[] coins) {
        if(amount == 0) return 1;
        if(coins.length == 0) return 0;

        Arrays.sort(coins);

        int[][] dp = new int[amount+1][coins.length];
        for (int i = 0; i <= amount; i++) {
            for (int t = 0; t < coins.length; t++) {
                dp[i][t] = -1;
            }
        }

        return getCount(amount, coins, 0, dp);
    }

    private int getCount(int amount, int[] coins, int coinIndex, int[][] dp){

        if(dp[amount][coinIndex] >= 0) return dp[amount][coinIndex];

        int count = 0;
        for(int i = coinIndex; i < coins.length; i++)
        {
            if(coins[i] == amount) {
                count++;
                break;
            }
            else if(coins[i] < amount){
                count += getCount(amount-coins[i], coins, i, dp);
            }
            else{
                break;
            }
        }

        dp[amount][coinIndex] = count;

        return count;
    }

}
