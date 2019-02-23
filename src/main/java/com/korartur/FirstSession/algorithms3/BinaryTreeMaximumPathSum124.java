package com.korartur.FirstSession.algorithms3;

import com.korartur.utils.TreeNode;

public class BinaryTreeMaximumPathSum124 {

    public int maxPathSum(TreeNode root){
        maxPathSum2(root);

        return maxSum;
    }

    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum2(TreeNode root) {
        if(root == null) return 0;

        int left= maxPathSum2(root.left);
        int right = maxPathSum2(root.right);


        int current = root.val;
        if(left > 0) current += left;
        if(right > 0) current += right;


        if(current > maxSum)maxSum = current;


        return root.val + Math.max(0, Math.max(left, right));
    }

}
