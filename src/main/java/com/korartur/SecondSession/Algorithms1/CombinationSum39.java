package com.korartur.SecondSession.Algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > target) break;

            if (candidates[i] == target) {
                List<Integer> curRes = new ArrayList<>();
                curRes.add(candidates[i]);
                result.add(curRes);
                break;
            }

            List<List<Integer>> curRes = getCombinations(i, target, candidates);
            if (curRes != null) {
                result.addAll(curRes);
            }
        }

        return result;
    }

    private List<List<Integer>> getCombinations(int from, int target, int[] candidates){
        if(from >= candidates.length) return null;
        List<List<Integer>> res = new ArrayList<>();
        if(candidates[from] > target) return null;
        if(candidates[from] == target){
            List<Integer> curRes = new ArrayList<>();
            curRes.add(target);
            res.add(curRes);

            return res;
        }

        int newTarget = target - candidates[from];
        for(int i = from; i < candidates.length; i++){
            if(candidates[i] > newTarget) break;
            List<List<Integer>> tempRes = getCombinations(i, newTarget, candidates);
            if(tempRes != null){
                for (List<Integer> temp : tempRes) {
                    List<Integer> curRes = new ArrayList<>();
                    curRes.add(candidates[from]);
                    curRes.addAll(temp);

                    res.add(curRes);
                }
            }
        }


        return res;
    }

}
