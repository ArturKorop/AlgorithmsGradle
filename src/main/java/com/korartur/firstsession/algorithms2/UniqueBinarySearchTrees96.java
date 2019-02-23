package com.korartur.firstsession.algorithms2;

public class UniqueBinarySearchTrees96 {
    public int numTrees(int n) {
        if(n < 2) return n;
        int[][] dp = new int[n+1][n+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return getNum(1, n, dp);
    }

    private int getNum(int from, int to, int[][] dp){
        if(from > to) return 0;
        if(from == to) return 1;
        if(dp[from][to] >= 0) return dp[from][to];

        int sum = 0;
        for(int i = from; i<= to; i++){
            int left =  getNum(from,i-1, dp);
            int right = getNum(i+1, to, dp);

            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;
            sum += left * right;
        }

        dp[from][to] = sum;

        return sum;
    }
}
