package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.HashMap;

public class BinaryTreeMaxPathSum124 {
    private int _max;
    public int maxPathSum(TreeNode root) {
        _max = Integer.MIN_VALUE;
        getMax(root);

        return _max;
    }

    private int getMax(TreeNode root){
        if(root == null) return 0;

        int left = getMax(root.left);
        int right = getMax(root.right);

        int max = Math.max(0, Math.max(left, right));
        int result = root.val + max;

        _max = Math.max(_max, root.val);
        _max = Math.max(_max, root.val + left);
        _max = Math.max(_max, root.val + right);
        _max = Math.max(_max, root.val + right + left);

        return result;
    }
}
