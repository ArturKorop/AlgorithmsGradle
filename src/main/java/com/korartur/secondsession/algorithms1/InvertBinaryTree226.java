package com.korartur.secondsession.algorithms1;

import com.korartur.utils.TreeNode;

public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }

    private void swap(TreeNode root){
        if(root == null) return;

        swap(root.left);
        swap(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right =temp;
    }

}
