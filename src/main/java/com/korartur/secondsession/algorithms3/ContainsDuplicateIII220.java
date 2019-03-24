package com.korartur.secondsession.algorithms3;

import java.util.TreeSet;

public class ContainsDuplicateIII220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(t < 0) return false;
        TreeSet<Integer> window = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];

            if(window.size() ==  k+1){
                window.remove(nums[i - k - 1]);
            }

            if(window.contains(cur)) return true;

            window.add(cur);


            long cl = cur;
            if(cur != window.first()) {
                long lower = window.lower(cur);
                if(cl - lower <= t) return true;
            }

            if(cur != window.last()) {
                long higher = window.higher(cur);
                if(higher - cl <= t) return true;
            }
        }

        return false;
    }
}
