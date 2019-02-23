package com.korartur.firstsession.algorithms2;

public class MinimumPathSum64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int t = 0; t < n; t++) {
                dp[i][t] = -1;
            }
        }

        dp[m - 1][n - 1] = grid[m-1][n-1];

        return getMinSum(0, 0, grid, dp, m - 1, n - 1);
    }

    private int getMinSum(int m, int n, int[][] grid, int[][] dp, int M, int N) {
        if (m > M || n > N) return -1;
        if (dp[m][n] >= 0) return dp[m][n];

        int left = getMinSum(m, n + 1, grid, dp, M,N);
        int down = getMinSum(m + 1, n, grid, dp,M,N);

        if(left == -1){
            dp[m][n] = down;
        } else if(down == -1){
            dp[m][n] = left;
        } else {
            dp[m][n] = Math.min(left, down);
        }

        dp[m][n] += grid[m][n];

        return dp[m][n];
    }
}
