package com.korartur.algorithms3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SplitArrayIntoConsSubs659 {
    public boolean isPossible(int[] nums) {
        if(nums.length < 3) return false;

        List<int[]> data = new ArrayList<>();
        data.add(new int[]{nums[0], 1});

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                data.add(new int[]{nums[i], 1});
            } else {
                data.get(data.size()-1)[1]++;
            }
        }

        List<int[]> groups = new ArrayList<>();

        int start = 0;
        for(int i = 1; i < data.size(); i ++){

            if(data.get(i)[0] - data.get(i-1)[0] > 1){
                if(i - start < 3) return false;

                groups.add(new int[]{start, i-1});
                start = i;

            }
        }

        if(data.size() - start < 3) return false;

        groups.add(new int[]{start, data.size()-1});

        for (int[] group : groups) {
            if(!isOk(data, group[0], group[1])) return false;
        }

        return true;
    }

    private boolean isOk(List<int[]> data, int from, int to) {
        if(to - from == 2){
            if(data.get(from)[1] != data.get(from+1)[1] || data.get(to)[1] != data.get(from+1)[1]) return false;
            return true;
        }

        int cur = data.get(from)[1];
        int next1 = data.get(from+1)[1];
        int next2 = data.get(from+2)[1];
        int next = Math.min(next1, next2);

        if(cur > next) return false;

        cur = data.get(to)[1];
        int prev1 = data.get(to-1)[1];
        int prev2 = data.get(to-2)[1];
        int prev = Math.min(prev1, prev2);

        if(cur > prev) return false;






         cur = data.get(from + 1)[1];
         next1= data.get(from+2)[1];
         next2 = data.get(from+3)[1];
         prev1 = data.get(from)[1];

        int max = Math.min(next1, prev1 + next2);
        if(cur > max) return false;


        cur = data.get(to-1)[1];
         prev1 = data.get(to-2)[1];
         prev2= data.get(to-3)[1];
         next1 = data.get(to)[1];

        max = Math.min(prev1, prev2 + next1);
        if(cur > max) return false;

        for(int i = from + 2 ; i <= to-2; i++){

             cur = data.get(i)[1];
             prev1= data.get(i-1)[1];
             prev2= data.get(i-2)[1];

             next1= data.get(i+1)[1];
             next2 = data.get(i+2)[1];

             prev = Math.min(prev1, prev2 + next1);
             next = Math.min(next1, next2 + prev1);
             int noncenter = Math.min(prev1, prev2) + Math.min(next1, next2);

             max = Math.max(prev, next);
             max=  Math.max(max, noncenter);

            if(cur > max) return false;
        }

        return true;

    }
}
