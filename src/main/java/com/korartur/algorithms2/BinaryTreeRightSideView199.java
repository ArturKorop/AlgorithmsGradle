package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        addToList(root, res, 0);
        return res;
    }

    private void addToList(TreeNode root, List<Integer> res, int level) {
        if(root == null) return;
        if(res.size() == level){
            res.add(root.val);
        }

        addToList(root.right, res, level+1);
        addToList(root.left, res, level+1);


    }
}
