package com.korartur.algorithms3;

import java.util.Arrays;

public class PerfectSquares279 {

    public int numSquares(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        int res = numSquares(n , dp);

        return res;
    }

    private int numSquares(int n, int[] dp) {
        if(dp[n] >= 0) return dp[n];

        if(n == 0) return 0;
        int max = (int)Math.sqrt(n);

        int min = Integer.MAX_VALUE;
        for(int i = max; i > 0; i--){
            int curMin = 1 + numSquares(n - (i*i), dp);
            if(curMin < min){
                min = curMin;
            }
        }

        dp[n] = min;

        return min;
    }
}
