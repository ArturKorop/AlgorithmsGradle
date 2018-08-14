package com.koratur.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class IncreasingSubsequences491 {

    public List<List<Integer>> findSubsequences2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        find(res, nums, 0, path);

        return res;
    }

    private void find(List<List<Integer>> res, int[] nums, int index, List<Integer> path) {

        if(path.size() > 1){
            res.add(new ArrayList<>(path));
        }

        HashSet<Integer> used = new HashSet<>();

        for(int i = index; i < nums.length; i++)
        {
            if(used.contains(nums[i])) continue;
            if(path.size() > 0 && nums[i] < path.get(path.size()-1)) continue;

            used.add(nums[i]);
            path.add(nums[i]);

            find(res, nums, i+1, path);

            path.remove(path.size()-1);
        }
    }


    public List<List<Integer>> findSubsequences(int[] nums) {

        HashSet<Data> res = new HashSet<>();
        res.add(new Data());

        for (int i = 0; i < nums.length; i++) {

            List<Data> add = new LinkedList<>();
            for (Data re : res) {
                if(re.list.size() == 0 || re.list.get(re.list.size()-1) <= nums[i]) {

                    Data clone = re.clone();
                    clone.list.add(nums[i]);
                    add.add(clone);
                }
            }

            res.addAll(add);
        }

        List<List<Integer>> result = new LinkedList<>();

        for (Data re : res) {
            if(re.list.size() > 1)
            {
                    result.add(re.list);
            }
        }

        return result;
    }

    private class Data{
        public List<Integer> list = new LinkedList<>();

        public Data clone()
        {
            List<Integer> cloneList = new LinkedList<>(list);
            Data c = new Data();
            c.list = cloneList;

            return c;
        }

        @Override
        public int hashCode() {
            int hash = 0;
            for (int i = 0; i < list.size(); i++) {
                hash += list.get(i) * i;
            }

            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            List<Integer> l = ((Data) obj).list;

            if(l.size() != list.size()) return false;

            for (int i = 0; i < l.size(); i++) {
                if(l.get(i) != list.get(i)) return false;
            }

            return true;
        }
    }

}
