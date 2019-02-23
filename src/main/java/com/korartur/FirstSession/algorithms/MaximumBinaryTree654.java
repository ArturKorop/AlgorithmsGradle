package com.korartur.FirstSession.algorithms;

import com.korartur.utils.TreeNode;

public class MaximumBinaryTree654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;

        TreeNode res = build(nums, 0, nums.length-1);

        return res;
    }

    private TreeNode build(int[] nums, int l, int r){
        if(l > r) return null;

        if(l == r){
            TreeNode res = new TreeNode(nums[l]);

            return res;
        }

        int max = l;
        for(int i = l+1; i <= r; i++){
            if(nums[i] > nums[max]) {
                max = i;
            }
        }

        TreeNode res = new TreeNode(nums[max]);

        res.left = build(nums, l, max-1);
        res.right = build(nums, max+1, r);

        return res;
    }

}
