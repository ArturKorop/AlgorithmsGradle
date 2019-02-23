package com.korartur.secondsession.algorithms1;

public class MinimumPathSum64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];


        return getMin(0,0,m-1,n-1,dp, grid);
    }

    private Integer getMin(int fX,int fY,int tX,int tY, int[][] dp, int[][] grid){
        if(fX > tX || fY > tY) return null;
        if(dp[fX][fY] > 0 ) return dp[fX][fY];
        if(fX == tX && fY == tY) return grid[fX][fY];

        Integer right = getMin(fX+1, fY, tX, tY, dp, grid);
        Integer down = getMin(fX, fY+1, tX, tY, dp, grid);

        if(right != null && down != null){
            int min = Math.min(right, down);

            dp[fX][fY] = min + grid[fX][fY];

            return dp[fX][fY];
        }
        else if(right != null){

            dp[fX][fY] = right + grid[fX][fY];

            return dp[fX][fY];
        }
        else{
            dp[fX][fY] = down + grid[fX][fY];

            return dp[fX][fY];
        }
    }
}
