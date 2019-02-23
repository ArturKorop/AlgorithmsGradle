package com.korartur.SecondSession.Algorithms1;

public class UniquePathsII63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int q = 0; q < n; q++) {
                dp[i][q] = -1;
            }
        }

        return getPaths(0, 0, m-1, n-1, obstacleGrid, dp);
    }

    private int getPaths(int fromX, int fromY, int toX, int toY, int[][] grid, int[][] dp){
        if(fromX > toX || fromY > toY) return 0;
        if(grid[fromX][fromY] == 1) return 0;
        if(dp[fromX][fromY] > -1) return dp[fromX][fromY];

        if(fromX == toX && fromY == toY) return 1;
        int right = getPaths(fromX+1, fromY, toX, toY, grid, dp);
        int down = getPaths(fromX, fromY+1, toX, toY, grid, dp);

        int total = right + down;
        dp[fromX][fromY] = total;

        return total;
    }
}
