package com.korartur.secondsession.algorithms1;

public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                dp[i][i1] = -1;
            }
        }

        return getUnique(0,0,m-1,n-1,dp);
    }

    private int getUnique(int fromX, int fromY, int toX, int toY, int[][] dp){
        if(fromX == toX && fromY == toY) return 1;
        if(fromX > toX || fromY > toY) return 0;

        if(dp[fromX][fromY] > -1) return dp[fromX][fromY];

        int right = getUnique(fromX+1, fromY, toX, toY, dp);
        int down = getUnique(fromX, fromY+1, toX, toY, dp);

        int sum = right + down;

        dp[fromX][fromY] = sum;

        return sum;
    }
}
