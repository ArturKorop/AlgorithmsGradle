package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        result.add(current);

        for (int i = 0; i < nums.length; i++) {

            int duplicateCount = 1;
            int lastDuplicateIndex = i;

            for(int k = i+1; k < nums.length; k++){
                if(nums[k] == nums[i]){
                    duplicateCount++;
                    lastDuplicateIndex++;
                }
                else{
                    break;
                }
            }

            i = lastDuplicateIndex;

            List<List<Integer>> tempResult = new ArrayList<>();
            List<List<Integer>> duplicateResult = new ArrayList<>();

            for (List<Integer> currentResult : result) {

                tempResult.add(new ArrayList<>(currentResult));
                List<Integer> clone = new ArrayList<>(currentResult);
                clone.add(nums[i]);
                duplicateResult.add(clone);
            }

            List<List<Integer>> tempDuplicateResult;
            for (int t = 0; t < duplicateCount-1; t++) {
                tempDuplicateResult = new ArrayList<>();

                for (List<Integer> duplicate : duplicateResult) {
                    List<Integer> duplicateClone = new ArrayList<>(duplicate);
                    duplicateClone.add(nums[i]);
                    tempDuplicateResult.add(duplicateClone);
                }

                tempResult.addAll(duplicateResult);
                duplicateResult = tempDuplicateResult;
            }

            tempResult.addAll(duplicateResult);

            result = tempResult;
        }

        return result;
    }


    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, list, result);
        return result;
    }
    private void dfs(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            dfs(nums, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}
