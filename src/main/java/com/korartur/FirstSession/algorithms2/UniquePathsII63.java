package com.korartur.FirstSession.algorithms2;

public class UniquePathsII63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                dp[i][i1] = -1;
            }
        }
        dp[0][0] = 1;

        int re =  unique(m-1,n-1, obstacleGrid, dp);
        return re;
    }

    private int unique(int m, int n, int[][] obstacle, int[][] dp){
        if(m < 0 || n < 0) return 0;

        if(dp[m][n] >= 0) return dp[m][n];
        if(obstacle[m][n] == 1){
            dp[m][n] = 0;
            return 0;
        }

        int res = unique(m-1,n, obstacle, dp) + unique(m, n-1, obstacle, dp);
        dp[m][n] = res;

        return res;
    }
}
