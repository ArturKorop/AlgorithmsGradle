package com.korartur.firstsession.algorithms;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostFrequentSubtreeSum508 {


    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) return new int[]{};

        HashMap<Integer, Integer> map = new HashMap<>();


        getSubTreeSum(root, map);

        int max = 1;

        for (Integer key : map.keySet()) {
            if(map.get(key) > max)
            {
                max = map.get(key);
            }
        }

        List<Integer> res = new ArrayList<>();

        for (Integer key : map.keySet()) {
            if(map.get(key) == max)
            {
                res.add(key);
            }
        }

        int[] r = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }

        return r;
    }

    private int getSubTreeSum(TreeNode root, HashMap<Integer, Integer> map)
    {
        if(root == null) return 0;

        int sum = root.val + getSubTreeSum(root.left, map) + getSubTreeSum(root.right, map);

        addOrUpdate(map, sum);

        return sum;
    }



    private void addOrUpdate(HashMap<Integer, Integer> map, int value)
    {
        int count = 1;
        if(map.containsKey(value)){
            count += map.get(value);
        }

        map.put(value, count);
    }
}


