package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

public class SumRootToLeafNumbers129 {
    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        goTo(root, 0);

        return sum;
    }

    private void goTo(TreeNode root, int prev){
        if(root == null) return;

        int updated = prev * 10;
        updated += root.val;

        if(root.left == null && root.right == null){
            sum += updated;
        }
        else{
            goTo(root.left, updated);
            goTo(root.right, updated);
        }
    }
}
