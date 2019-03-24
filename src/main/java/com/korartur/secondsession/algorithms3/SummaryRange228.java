package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;

        int start = -1;
        int prev = -1;


        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if(prev == -1){
                start = i;
                prev = i;
                continue;
            }
            else{
                if(cur - nums[prev]== 1){
                    prev = i;
                }
                else{
                    if(nums[start] < nums[prev]) {
                        res.add(nums[start] + "->" + nums[prev]);
                    }
                    else{
                        res.add(String.valueOf(nums[start]));
                    }
                    start = i;
                    prev = i;
                }
            }
        }

        if(start == prev){
            res.add(String.valueOf(nums[start]));
        }
        else{
            res.add(nums[start] + "->" + nums[prev]);
        }

        return res;
    }
}
