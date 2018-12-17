package com.korartur.algorithms3;

public class BurstBalloons312 {
    public int maxCoins(int[] nums) {

        int[][] dp = new int[nums.length][nums.length];

        return getMax(nums, 0, nums.length-1, 1,1, dp);
    }

    private int getMax(int[] nums, int from, int to, int leftBound, int rightBound, int[][] dp) {
        if(from > to) return 0;
        if(from == to) return nums[from] * leftBound * rightBound;
        if(dp[from][to] > 0) return dp[from][to];

        if(from == to - 1){

            int max = getMaxFrom2(nums[from], nums[to], leftBound, rightBound);
            dp[from][to] = max;

            return max;
        }

        if(from == to - 1){

            int max = getMaxFrom3(nums[from], nums[from+1], nums[to], leftBound, rightBound);
            dp[from][to] = max;

            return max;
        }


        int max = 0;

        for(int i = from; i <= to; i++){
            int curMax = nums[i] * leftBound * rightBound + getMax(nums, from, i-1, leftBound, nums[i], dp) + getMax(nums, i+1, to, nums[i], rightBound, dp);
            if(curMax > max) max = curMax;
        }

        dp[from][to] = max;

        return max;
    }


    private int getMaxFrom2(int a, int b, int leftBound, int rightBound){
        int max1 = a * leftBound * b + b * leftBound * rightBound;
        int max2 = b * rightBound * a + a * leftBound * rightBound;

        int max = Math.max(max1, max2);

        return max;
    }

    private int getMaxFrom3(int a, int b, int c, int leftBound, int rightBound){
        int max1 = a * leftBound * rightBound + getMaxFrom2(b,c, a, rightBound);
        int max2 = b * leftBound * rightBound + a * leftBound * b + c * rightBound * b;
        int max3 = c * leftBound * rightBound + getMaxFrom2(a,b, leftBound, c);

        int max = Math.max(max1, max2);
        max=  Math.max(max, max3);

        return max;
    }

}
