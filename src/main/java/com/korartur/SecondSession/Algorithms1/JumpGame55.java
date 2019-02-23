package com.korartur.SecondSession.Algorithms1;

public class JumpGame55 {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];

        return getMax(nums, 0, dp) >= nums.length - 1;
    }

    private  int getMax(int[] nums, int from, int[] dp){
        if(from + nums[from] >= nums.length ) return nums.length;
        if(nums[from] == 0) return from;

        int count = nums[from];

        int max = 1 + nums[from+1];
        int ind = from + 1;

        for(int i = from+2; i <= from + count; i++){

            int curMax = i - from + nums[i];
            if(curMax > max){
                max =curMax;
                ind = i;
            }
        }


        return getMax(nums, ind, dp);
    }

}
