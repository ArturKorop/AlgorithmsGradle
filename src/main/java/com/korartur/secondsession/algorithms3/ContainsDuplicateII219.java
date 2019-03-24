package com.korartur.secondsession.algorithms3;

import java.util.HashMap;

public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else{
                int prev = map.get(nums[i]);
                if(i - prev <= k) return true;
                map.put(nums[i], i);
            }
        }

        return false;
    }
}
