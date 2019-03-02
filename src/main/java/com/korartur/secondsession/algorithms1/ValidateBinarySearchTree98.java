package com.korartur.secondsession.algorithms1;

import com.korartur.utils.TreeNode;

public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode root, Integer left, Integer right){
        if(root == null) return true;

        if(left != null && root.val <= left)  return false;
        if(right != null && root.val >= right) return false;

        return isValid(root.left, left, root.val)  && isValid(root.right, root.val, right);
    }
}
