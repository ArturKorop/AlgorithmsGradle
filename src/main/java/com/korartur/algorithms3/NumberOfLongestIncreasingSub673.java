package com.korartur.algorithms3;

public class NumberOfLongestIncreasingSub673 {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length < 2) return nums.length;


        int[][] dp = new int[nums.length][2];
        int[] max = getMax(0, nums, dp);
        int min = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= min){

                int[] cur = getMax(i, nums, dp);
                if(cur[0] > max[0]){
                    max = cur;
                } else if(cur[0] == max[0]){
                    max[1] += cur[1];
                }

            }
        }


        return max[1];
    }

    private int[] getMax(int index, int[] nums, int[][] dp){
        if(index == nums.length) return new int[]{0,0};
        if(dp[index][1] > 0){
            int[] temp = dp[index];
            return new int[]{temp[0], temp[1]};
        }

        int min = nums[index];
        int[] max = new int[]{0,1};

        for(int i = index+1; i < nums.length; i++){
            if(nums[i] > min){
                int[] cur = getMax(i, nums, dp);
                if(cur[0] > max[0]){
                    max = cur;
                } else if(cur[0] == max[0]){
                    max[1] += cur[1];
                }
            }
        }

        max[0] += 1;

        dp[index][0] = max[0];
        dp[index][1] = max[1];

        return max;
    }





}
