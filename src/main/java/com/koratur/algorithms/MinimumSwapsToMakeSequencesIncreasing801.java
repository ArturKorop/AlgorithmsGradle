package com.koratur.algorithms;

public class MinimumSwapsToMakeSequencesIncreasing801 {
    public int minSwap(int[] A, int[] B) {
        if(A.length < 2) return 0;
        int[][] dp = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            for (int i1 = 0; i1 < A.length; i1++) {
                dp[i][i1] = -2;
            }
        }

        return getMinSwap(A, B, 1, -1, dp);
    }


    private int getMinSwap(int[] A, int[] B, int index, int lastSwap, int[][] dp){
        if(index == A.length) return 0;
        if(dp[index][lastSwap+1] != -2) return dp[index][lastSwap+1];

        int prevA = A[index-1];
        int prevB = B[index-1];
        if(lastSwap == index -1){
            prevA = prevA ^ prevB;
            prevB = prevA ^ prevB;
            prevA = prevA ^ prevB;
        }
        if(A[index] > prevA && B[index] > prevB) {
            int res = getMinSwap(A,B, index+1, lastSwap, dp);
            dp[index][lastSwap + 1] = res;
            return res;
        }

        int leftSwap = getLastSwap(A, B, index-1, lastSwap);
        int rightSwap = getLastSwap(A,B, index, lastSwap);

        if(leftSwap == -1 && rightSwap == -1)  {
            dp[index][lastSwap+1] = -1;
            return -1;
        }

        int leftCount = Integer.MAX_VALUE;
        if(leftSwap != -1){
            int swap = getMinSwap(A,B,index+1, leftSwap, dp);
            if(swap != -1) leftCount = (index - leftSwap) + swap;
        }

        int rightCount = Integer.MAX_VALUE;
        if(rightSwap != -1) {
            int swap = getMinSwap(A, B, index+1, rightSwap, dp);
            if(swap != -1) rightCount = (index - rightSwap + 1) + swap;
        }

        if(leftCount == Integer.MAX_VALUE && rightCount == Integer.MAX_VALUE) {
            dp[index][lastSwap+1] = -1;
            return -1;
        }

        int res = Math.min(leftCount, rightCount);
        dp[index][lastSwap +1] = res;

        return res;
    }

    private int getLastSwap(int[] A, int[] B, int index, int lastSwap){
        int i = index;

        int prevA = B[index];
        int prevB = A[index];
        while (i > lastSwap+1){
            if(prevA > A[i-1] && prevB > B[i-1]){
                break;
            }

            i--;
            prevA = B[i];
            prevB = A[i];
        }

        if(i == 0) return 0;

        if(i == lastSwap+1){
            if(prevA > B[lastSwap] && prevB > A[lastSwap]){
                return i;
            }
        }

        return i;

    }
}
