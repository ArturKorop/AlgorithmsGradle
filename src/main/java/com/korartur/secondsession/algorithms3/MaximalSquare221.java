package com.korartur.secondsession.algorithms3;

public class MaximalSquare221 {
    public int maximalSquare(char[][] matrix) {
        int h = matrix.length;
        if(h == 0) return 0;
        int w = matrix[0].length;
        if(w == 0) return 0;

        int[][] dp = new int[h+1][w+1];
        int max = 0;

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){

                if(matrix[i-1][j-1] == '0') continue;

                int min = Math.min(dp[i-1][j], dp[i][j-1]);
                min = Math.min(min, dp[i-1][j-1]);

                dp[i][j] = min + 1;
                max = Math.max(max, dp[i][j]);
            }
        }

        return max * max;
    }
}
