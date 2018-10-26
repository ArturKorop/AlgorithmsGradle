package com.korartur.algorithms;

public class MaximumLengthOfRepeatedSubarray718 {


    public int findLength(int[] A, int[] B) {

        int[][] dp = new int[A.length+1][B.length+1];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            for (int t = 0; t < B.length; t++) {
                if(A[i] == B[t]) {
                    int curMax = dp[i][t] + 1;
                    dp[i+1][t+1] = curMax;
                    if(curMax > max){
                        max =  curMax;
                    }
                }
            }
        }


        return max;
    }
}
