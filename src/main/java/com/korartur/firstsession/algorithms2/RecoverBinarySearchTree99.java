package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeNode;

public class RecoverBinarySearchTree99 {

    TreeNode first =  null;
    TreeNode second = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        travers(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void travers(TreeNode root){
        if(root == null) return;

        travers(root.left);

        if(first == null && prev.val >= root.val){
            first = prev;
        }

        if(first != null && prev.val >= root.val){
            second = root;
        }

        prev = root;

        travers(root.right);
    }

}
