package com.korartur.secondsession.algorithms1;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> left = inorderTraversal(root.left);
        List<Integer> right = inorderTraversal(root.right);

        List<Integer> result = new ArrayList<>();

        result.addAll(left);
        result.add(root.val);
        result.addAll(right);

        return result;
    }
}
