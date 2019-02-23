package com.korartur.FirstSession.algorithms3;

public class LongestIncreasingSubsequence300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length < 2) return nums.length;

        int[] data = new int[nums.length];
        data[0] = nums[0];
        int index = 1;

        for(int i = 1; i < nums.length; i++){
            int ind = index-1;
            while (ind >= 0 && data[ind] > nums[i]){
                ind--;
            }

            if(ind >= 0) {
                data[ind+1] = nums[i];
                if (ind == index-1) index++;
            } else {
                data[0] = nums[i];
            }
        }

        return index;
    }
}
