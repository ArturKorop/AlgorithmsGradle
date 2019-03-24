package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        return getComb(k, n, 1);
    }

    private List<List<Integer>> getComb(int k, int target, int from){
        List<List<Integer>> res = new ArrayList<>();
        if(k == 0 || target == 0) return res;

        for(int i = from; i <= 9; i++){
            if(i == target && k == 1){
                List<Integer> curL = new ArrayList<>();
                curL.add(i);
                res.add(curL);
                return res;
            }
            else if(i > target){
                break;
            }
            else{
                List<List<Integer>> other = getComb(k-1, target-i, i+1);
                if(other != null && other.size() > 0){

                    for (List<Integer> o : other) {
                        List<Integer> curL = new ArrayList<>();
                        curL.add(i);
                        curL.addAll(o);
                        res.add(curL);
                    }
                }
            }
        }

        return res;
    }
}
