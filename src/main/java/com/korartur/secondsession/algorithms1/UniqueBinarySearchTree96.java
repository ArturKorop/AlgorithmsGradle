package com.korartur.secondsession.algorithms1;

public class UniqueBinarySearchTree96 {
    public int numTrees(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;


        return calc(n, dp);
    }

    private int calc(int n, int[] dp){
        if(n < 0 || n >= dp.length) return 0;
        if(dp[n] > 0) return dp[n];

        int result = 0;
        for(int i = 1; i <= n; i++){

            int leftCount = calc(i-1, dp);
            int rightCount = calc(n - i, dp);

            if(leftCount == 0 || rightCount == 0){
                result += leftCount + rightCount;
            }
            else{
                result += leftCount * rightCount;
            }
        }

        dp[n] = result;
        return  result;
    }


}
