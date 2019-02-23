package com.korartur.secondsession.algorithms1;

import java.util.Arrays;

public class Sum3Closest16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int cur = nums[i];

            int l = i+1;
            int r = nums.length-1;

            while (l < r){
                int curSum = cur + nums[l] + nums[r];
                if(curSum == target){
                    return curSum;
                }
                else if(curSum > target){

                    int currDiff = Math.abs(target - curSum);
                    if(currDiff < diff){
                        diff=  currDiff;
                        closest = curSum;
                    }

                    r--;
                }
                else {
                    int currDiff = Math.abs(target - curSum);
                    if(currDiff < diff){
                        diff=  currDiff;
                        closest = curSum;
                    }

                    l++;
                }
            }
        }

        return closest;
    }
}
