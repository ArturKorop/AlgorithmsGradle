package com.korartur.secondsession.algorithms3;

import com.korartur.utils.TreeNode;

public class CountCompleteTreeNodes222 {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int depth = getLeftDepth(root);
        if(depth == 1) return 1;

        int count = 0;
        for(int i = 0; i < depth-1; i++){
            count += (int)Math.pow(2, i);
        }

        int lastRow = getLastRowCount(root, depth-1);

        return count + lastRow;
    }

    private int getLastRowCount(TreeNode root, int depth){
        if(root == null) return 0;
        if(root.left == null)
        {
            if(depth == 0) return 1;
            return 0;
        }

        if(getRightDepth(root.left) == depth){
            return (int)Math.pow(2, depth-1) + getLastRowCount(root.right, depth-1);
        }
        else{
            return getLastRowCount(root.left, depth-1);
        }
    }

    private int getRightDepth(TreeNode root){
        if(root == null) return 0;
        TreeNode temp = root;
        int res = 0;
        while (temp != null){
            res++;
            temp = temp.right;
        }

        return res;
    }


    private int getLeftDepth(TreeNode root){
        if(root == null) return 0;
        int res = 0;
        TreeNode temp = root;

        while (temp != null){
            res++;
            temp = temp.left;
        }

        return res;
    }
}
