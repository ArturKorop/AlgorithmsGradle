package com.korartur.firstsession.algorithms3;

import com.korartur.utils.TreeNode;

public class CountCompleteTreeNodes222 {

    public int countNodes(TreeNode root) {
        int h = getHeight(root);
        if(h < 2) return h;

        int last = getLast(root, h-1, (int)Math.pow(2, h-1));

        int count = (int)Math.pow(2, h-1) - 1;

        return count + last;
    }

    private int getHeight(TreeNode root){
        int res = 0;
        TreeNode temp = root;
        while (temp != null) {
            res++;
            temp = temp.left;
        }

        return res;
    }

    private int getLast(TreeNode root, int h, int total){
        if(root == null) return 0;
        if(getMaxRight(root.left) == h){

            if(getMaxRight(root.right) == h) return total;

            return total/2 + getLast(root.right, h-1, total/2);
        } else {
            return getLast(root.left, h-1, total/2);
        }
    }

    private int getMaxRight(TreeNode root){
        if(root == null) return 0;

        return 1 + getMaxRight(root.right);
    }
}
