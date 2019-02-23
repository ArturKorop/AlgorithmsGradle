package com.korartur.firstsession.algorithms;

public class LargestSumOfAverages813 {
    public double largestSumOfAverages(int[] A, int K) {
        double[][] dp =  new double[A.length][K+1];

        return getMax(A, 0, K, dp);

    }

    private double getMax(int[] a, int index, int k, double[][] dp) {

        if(k == 1){
            double sum = 0;
            for(int i = index; i < a.length; i++){
                sum += a[i];
            }

            dp[index][k] = sum/(a.length - index);

            return dp[index][k];
        }

        if(dp[index][k] > 0) return dp[index][k];

        double max = 0;
        double sum = 0;
        int count = 0;

        for(int i = index; i <= a.length - k;i++){
            sum += a[i];
            count++;
            double cur = ((double)sum/count) + getMax(a, i+1, k-1, dp);
            if(cur > max) max = cur;
        }

        dp[index][k] = max;

        return max;

    }
}
