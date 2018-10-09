package com.koratur.algorithms;

import com.koratur.utils.TreeNode;

import java.util.HashMap;

public class BinaryTreePruning814 {
    public TreeNode pruneTree(TreeNode root) {
        needRemove(root);

        return root;
    }

    private boolean needRemove(TreeNode node){
        if(node == null) return true;

        boolean removeLeft= needRemove(node.left);
        if(removeLeft) node.left = null;

        boolean removeRight = needRemove(node.right);
        if(removeRight) node.right = null;

        return node.val == 0 && removeLeft && removeRight;
    }
}
