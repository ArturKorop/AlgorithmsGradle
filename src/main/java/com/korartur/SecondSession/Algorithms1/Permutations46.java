package com.korartur.SecondSession.Algorithms1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations46 {
    public List<List<Integer>> permute(int[] nums) {

        Integer[] n = new Integer[nums.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = nums[i];
        }

        return get(n);
    }

    private List<List<Integer>> get(Integer[] nums){
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == null) continue;

            int tempValue = nums[i];
            nums[i] = null;
            List<List<Integer>> tempRes = get(nums);
            nums[i] = tempValue;

            if(tempRes.size() > 0) {
                for (List<Integer> tempResItem : tempRes) {
                    tempResItem.add(0, tempValue);
                    result.add(tempResItem);

                }
            }
            else{
                List<Integer> tempResItem = new ArrayList<>();
                tempResItem.add(tempValue);
                result.add(tempResItem);
            }
        }

        return result;
    }
}
