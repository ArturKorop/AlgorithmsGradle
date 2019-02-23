package com.korartur.FirstSession.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn740 {
    public int deleteAndEarn(int[] nums) {

        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int[] ar = new int[map.keySet().size()];
        int i = 0;
        for (Integer key : map.keySet()) {
            ar[i] = key;
            i++;
        }

        Arrays.sort(ar);

        return getMax(map, ar, 0, new int[ar.length]);
    }

    private int getMax(Map<Integer, Integer> map, int[] ar, int index, int[] dp) {

        int max = 0;
        if (index >= ar.length) return max;
        if(dp[index] > 0) return dp[index];

        if (index == ar.length - 1) {
            max = map.get(ar[index]) * ar[index];
            dp[index] = max;
            return max;
        }

        if(ar[index] == ar[index+1]-1) {
            int max1 = map.get(ar[index]) * ar[index] + getMax(map, ar, index + 2, dp);
            int max2 = getMax(map, ar, index+1, dp);
            max = Math.max(max1, max2);
        } else{
            max = map.get(ar[index]) * ar[index] + getMax(map, ar, index + 1, dp);
        }

        dp[index] = max;

        return max;
    }
}
