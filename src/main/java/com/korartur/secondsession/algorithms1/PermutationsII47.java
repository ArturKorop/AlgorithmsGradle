package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Integer[] n = new Integer[nums.length];
        List<List<Integer>> res2 = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            n[i] = nums[i];
        }

        List<List<Integer>> curREs = getPerm(n);
        for (List<Integer> curRE : curREs) {
            res2.add(curRE);
        }

        return res2;
    }

    private List<List<Integer>> getPerm(Integer[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Integer prev = null;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == null) continue;
            if(i > 0 && prev != null  && nums[i] == prev) continue;
            prev = nums[i];

            int temp = nums[i];
            nums[i] = null;

            List<List<Integer>> curRes = getPerm(nums);
            if(curRes.size() > 0){
                for (List<Integer> curRe : curRes) {
                    curRe.add(0, temp);
                    res.add(curRe);
                }
            }
            else{
                List<Integer> curRe = new ArrayList<>();
                curRe.add(temp);
                res.add(curRe);
            }

            nums[i] = temp;
        }

        return res;
    }
}
