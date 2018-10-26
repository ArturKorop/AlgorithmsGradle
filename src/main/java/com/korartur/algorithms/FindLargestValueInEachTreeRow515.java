package com.korartur.algorithms;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInEachTreeRow515 {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        fill(res, root, 0);

        return res;
    }

    private void fill(List<Integer> res, TreeNode root, int level) {
        if(root == null) return;

        if(res.size() <= level) {
            res.add(root.val);
        }
        else {
            if(res.get(level) < root.val){
                res.set(level, root.val);
            }
        }

        fill(res, root.left, level+1);
        fill(res, root.right, level+1);
    }

}
