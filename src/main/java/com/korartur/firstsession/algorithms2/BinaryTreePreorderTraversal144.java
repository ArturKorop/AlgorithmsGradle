package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        fill(root, res);

        return res;
    }

    private void fill(TreeNode root, List<Integer> res) {
        if(root == null) return;
        res.add(root.val);
        fill(root.left, res);
        fill(root.right, res);
    }
}
