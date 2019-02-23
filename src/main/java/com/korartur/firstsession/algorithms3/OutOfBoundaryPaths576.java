package com.korartur.firstsession.algorithms3;

public class OutOfBoundaryPaths576 {

    public int findPaths(int m, int n, int N, int i, int j) {

        long[][][] dp = new long[m][n][N+1];
        for (int i1 = 0; i1 < m; i1++) {
            for (int i2 = 0; i2 < n; i2++) {
                for (int i3 = 1; i3 < N+1; i3++) {
                    dp[i1][i2][i3] = -1;
                }
            }
        }

        long curRes = getPathsCount(m,n,N, i, j, dp);

        return  (int)(curRes % (1000000000 + 7));

    }

    private long getPathsCount(int m, int n, int N, int i, int j, long[][][] dp){
        if(dp[i][j][N] >= 0) return dp[i][j][N];

        long res = 0;
        if(i == 0){
            res++;
        }
        else{
            res += getPathsCount(m,n,N-1, i-1, j, dp);
        }

        if(i == m-1){
            res++;
        }
        else{
            res += getPathsCount(m,n,N-1, i+1, j, dp);
        }

        if(j == 0){
            res++;
        }
        else{
            res += getPathsCount(m,n,N-1, i, j-1, dp);
        }

        if(j == n-1){
            res++;
        }
        else{
            res += getPathsCount(m,n,N-1, i, j+1, dp);
        }

        dp[i][j][N] = res % (1000000000+7);

        return  dp[i][j][N];
    }

}
