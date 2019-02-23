package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < candidates.length; i++){

            if(candidates[i] > target) break;
            if(candidates[i] == target){
                List<Integer> curRes = new ArrayList<>();
                curRes.add(target);
                result.add(curRes);
                break;
            }

            if(i > 0 && candidates[i] == candidates[i-1]) continue;

            List<List<Integer>> tempResult = getCombinations(i, candidates, target);

            if(tempResult != null && tempResult.size() > 0){

                for (List<Integer> temp : tempResult) {
                    result.add(temp);
                }
            }
        }


        return result;
    }

    private List<List<Integer>> getCombinations(int from, int[] candidates, int target){

        if(from >=candidates.length ) return null;
        List<List<Integer>> result = new ArrayList<>();
        int newTarget = target - candidates[from];
        if(newTarget == 0){
            List<Integer> curRes = new ArrayList<>();
            curRes.add(target);
            result.add(curRes);

            return result;
        }

        for(int i = from+1; i < candidates.length; i++){

            if(candidates[i] > target) break;

            if(i > from+1 && candidates[i] == candidates[i-1]) continue;

            List<List<Integer>> tempResult = getCombinations(i, candidates, newTarget);

            if(tempResult != null && tempResult.size() > 0){

                for (List<Integer> temp : tempResult) {
                    List<Integer> curRes = new ArrayList<>();
                    curRes.add(candidates[from]);
                    curRes.addAll(temp);
                    result.add(curRes);
                }
            }
        }

        return result;
    }
}
