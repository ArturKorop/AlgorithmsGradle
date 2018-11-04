package com.korartur.utils;

public class TreeLinkNode {
    public int val;
    public TreeLinkNode left, right, next;

    public TreeLinkNode(int x) {
        val = x;
    }

    public static TreeLinkNode convert(TreeNode node){
        if(node == null) return null;
        TreeLinkNode root = new TreeLinkNode(node.val);
        root.left = convert(node.left);
        root.right = convert(node.right);

        return root;
    }
}
