package com.korartur.secondsession.algorithms3;

public class BurstBalloons312 {
    public int maxCoins(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int[][] dp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                dp[i][i1] = -1;
            }

        }

        return getMax(nums, 0, nums.length-1, 1, 1, dp);
    }


    private int result = 0;

    private int getMax(int[] nums, int from, int to, int leftBorder, int rightBorder, int[][] dp){
        if(dp[from][to] >= 0) return dp[from][to];

        if(from == to){
            int res = leftBorder * rightBorder * nums[from];
            dp[from][to] = res;
            return res;
        }

        int max = 0;
        for(int i = from; i <= to; i++){

            int left = i == 0 ? 0 : getMax(nums, from, i-1, leftBorder, nums[i], dp);
            int right = i == nums.length-1 ? 0 : getMax(nums, i+1, to, nums[i], rightBorder, dp);
            int curMax = left + right + nums[i] * leftBorder * rightBorder;

            max = Math.max(max, curMax);
        }

        dp[from][to] = max;
        return max;
    }
}
