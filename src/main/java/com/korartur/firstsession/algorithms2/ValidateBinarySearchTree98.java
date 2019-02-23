package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeNode;

public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        return isValidLeft(root.left, root.val, Long.MIN_VALUE, root.val)
                && isValidRight(root.right, root.val, root.val, Long.MAX_VALUE);
    }

    private boolean isValidLeft(TreeNode root, int parentValue, long min, long max){
        if(root == null) return true;
        if(root.val >= parentValue || root.val <= min || root.val >= max) return false;

        boolean res = isValidLeft(root.left, root.val, min, root.val) &&
                isValidRight(root.right, root.val, root.val, max);

        return res;
    }

    private boolean isValidRight(TreeNode root, int parentValue, long min, long max){
        if(root == null) return true;
        if(root.val <= parentValue || root.val <= min|| root.val >= max) return false;

        boolean res = isValidLeft(root.left, root.val, min, root.val) &&
                isValidRight(root.right, root.val, root.val, max);

        return res;
    }



}
