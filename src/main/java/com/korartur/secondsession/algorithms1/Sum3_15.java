package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++){

            if(i > 0 && nums[i] == nums[i-1]) continue;

            int cur = nums[i];

            int l = i+1;
            int r = nums.length-1;
            while (l < r){

                int curSum = cur + nums[l] + nums[r];
                if(curSum == 0){
                    List<Integer> cl = new ArrayList<>();
                    cl.add(cur);
                    cl.add(nums[l]);
                    cl.add(nums[r]);
                    res.add(cl);

                    l++;
                    while (l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    r--;
                    while (r > l && nums[r] == nums[r+1]){
                        r--;
                    }
                }
                else if(curSum > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }

        return res;
    }
}
