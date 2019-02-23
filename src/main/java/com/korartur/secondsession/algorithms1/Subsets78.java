package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> curRes : result) {
                List<Integer> clone = new ArrayList<>(curRes);
                clone.add(nums[i]);
                temp.add(clone);
                temp.add(curRes);
            }

            result = temp;
        }

        return result;
    }
}
