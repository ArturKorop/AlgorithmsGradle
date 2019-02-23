package com.korartur.FirstSession.algorithms;

import java.util.HashMap;

public class LongestHarmoniousSubsequence594 {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0;

        for (Integer key : map.keySet()) {


            int lCount = map.get(key);
            int lLess = map.getOrDefault(key-1, 0);
            int lMore = map.getOrDefault(key+1, 0);

            if(lLess > lMore){

                if(lCount + lLess > max){
                    max = lCount + lLess;
                }
            }
            else{

                if(lCount + lMore > max){
                    max = lCount + lMore;
                }
            }
        }

        return max;
    }
}
