package com.korartur.firstsession.algorithms2;

public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1) return 1;
        int[][] dp = new int[m+1][n+1];
        dp[1][1] = 1;

        return unique(m,n,dp);
    }

    private int unique(int m, int n, int[][] dp){
        if(dp[m][n] > 0) return dp[m][n];

        if(m == 1 || n == 1) {
            dp[m][n] = 1;
            return 1;
        }

        int res = unique(m-1,n,dp) + unique(m, n-1,dp);
        dp[m][n] = res;

        return res;
    }
}
