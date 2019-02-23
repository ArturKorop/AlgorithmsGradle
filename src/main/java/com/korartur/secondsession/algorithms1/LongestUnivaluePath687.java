package com.korartur.secondsession.algorithms1;

import com.korartur.utils.TreeNode;

public class LongestUnivaluePath687 {
    private  int result = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;

        int left = getMax(root.left, root.val);
        int right = getMax(root.right, root.val);
        int total = left + right + 1;

        return Math.max(result, total) - 1;
    }

    private int getMax(TreeNode root, int val){
        if(root == null) return 0;

        int left = getMax(root.left, root.val);
        int right = getMax(root.right, root.val);

        int total = left + right  + 1;
        if(total > result){
            result = total;
        }

        if(root.val == val){
            return Math.max(left + 1, right + 1);
        }

        return 0;
    }


}
