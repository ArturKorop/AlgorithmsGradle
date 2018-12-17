package com.korartur.algorithms3;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return new ArrayList<>();


        List<long[]> data = new ArrayList<>();
        init(root, 0, data);

        List<Double> res = new ArrayList<>();
        for (long[] datum : data) {
            res.add((double)datum[0]/datum[1]);
        }

        return res;
    }

    private void init(TreeNode root, int level,  List<long[]> data){
        if(root == null) return;

        if(data.size() <= level){
            data.add(new long[2]);
        }

        data.get(level)[0] += root.val;
        data.get(level)[1]++;

        init(root.left, level+1, data);
        init(root.right, level+1, data);
    }
}
