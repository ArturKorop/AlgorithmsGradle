package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

public class FlattenBinaryTreeToLinkedList114 {
    public void flatten(TreeNode root) {
        if(root == null) return;
        process(root);
    }

    private TreeNode process(TreeNode root){
        if(root == null) return null;

        TreeNode left = process(root.left);
        TreeNode right = process(root.right);


        if(left == null && right == null){
            return root;
        }
        else if(left == null){
            root.right = root.right;
            return right;
        }
        else if(right == null){
            root.right = root.left;
            root.left = null;
            return left;
        }
        else{
            left.right = root.right;
            root.right = root.left;
            root.left = null;
            return right;
        }
    }
}
