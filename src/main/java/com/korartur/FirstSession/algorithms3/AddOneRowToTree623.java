package com.korartur.FirstSession.algorithms3;

import com.korartur.utils.TreeNode;

public class AddOneRowToTree623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1){
            TreeNode node = new TreeNode(v);
            node.left = root;

            return node;
        }

        add(root, v, d-1, 1);

        return root;

    }

    private void add(TreeNode node, int v, int desiredD, int currentD){
        if(node == null) return;
        if(currentD == desiredD){

            TreeNode left = node.left;
            TreeNode right = node.right;

            node.left = new TreeNode(v);
            node.right = new TreeNode(v);

            node.left.left = left;
            node.right.right = right;
        } else {
            add(node.left, v, desiredD, currentD+1);
            add(node.right, v, desiredD, currentD+1);
        }
    }
}
