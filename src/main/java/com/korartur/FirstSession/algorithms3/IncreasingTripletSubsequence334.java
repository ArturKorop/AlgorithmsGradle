package com.korartur.FirstSession.algorithms3;

public class IncreasingTripletSubsequence334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;

        int min = nums[0];
        int max= Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max) return true;
            if(nums[i] > min && nums[i] < max){
                max = nums[i];
            } else if(nums[i] < min){
                min = nums[i];
            }

        }

        return false;

    }
}

