package com.korartur.FirstSession.algorithms2;

import com.korartur.utils.TreeNode;

public class FlattenBinaryTreeToLinkedList114 {
    public void flatten(TreeNode root) {
        getNode(root);
    }

    private TreeNode[] getNode(TreeNode root){
        if(root == null) return null;

        TreeNode[] left = getNode(root.left);
        TreeNode[] right =  getNode(root.right);

        TreeNode last = root;
        if(left != null){
            root.right = left[0];
            last = left[1];
        }

        if(right != null){
            last.right = right[0];
            last = right[1];
        }

        root.left = null;

        return new TreeNode[]{root, last};
    }
}
