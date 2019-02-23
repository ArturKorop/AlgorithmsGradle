package com.korartur.firstsession.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubarraySumEqualsK560 {

    public int subarraySum(int[] nums, int k) {
        int res = 0;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum)){
                map.get(sum).add(i);
            }
            else {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(sum, l);
            }

            if(sum == k){
                res++;
            }
        }

        int curSum = 0;
        for (int i = 1; i < nums.length; i++) {
            curSum += nums[i-1];
            int target = k + curSum;
            if(map.containsKey(target)){

                List<Integer> l = map.get(target);
                int lessCount = 0;
                for (int t = 0; t < l.size(); t++) {
                    if(l.get(t) >= i){
                        break;
                    }

                    lessCount++;
                }

                res += l.size() - lessCount;
            }
        }

        return res;
    }
}
