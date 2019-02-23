package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 3;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j = i+1; j < nums.length - 2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int cur = nums[i] + nums[j];

                int l = j+1;
                int r = nums.length -1;

                while (l < r){

                    int sum = nums[l] + nums[r];
                    int total = cur + sum;
                    if(total == target){
                        List<Integer> curRes = new ArrayList<>();
                        curRes.add(nums[i]);
                        curRes.add(nums[j]);
                        curRes.add(nums[l]);
                        curRes.add(nums[r]);
                        res.add(curRes);

                        l++;
                        while (l < r && nums[l] == nums[l-1]){
                            l++;
                        }
                        r--;
                        while (r > l && nums[r] == nums[r+1]){
                            r--;
                        }

                    }
                    else if(total > target){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }

        return res;
    }
}
