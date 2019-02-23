package com.korartur.firstsession.algorithms;

import com.korartur.utils.TreeNode;

public class FindBottomLeftTreeValue513 {

    public int findBottomLeftValue(TreeNode root) {

        Data res = getMaxLevel(root, 0);

        return res.value;
    }

    private Data getMaxLevel(TreeNode root, int level) {

        if(root == null) return null;

        Data l = getMaxLevel(root.left, level+1);
        Data r = getMaxLevel(root.right, level+1);

        if(l == null && r == null) {
            Data  d = new Data();
            d.value = root.val;
            d.level = level;

            return d;
        }
        else if(r == null){
            return l;
        }
        else if(l == null){
            return r;
        }
        else{
            if(l.level >= r.level){
                return l;
            }

            return r;
        }
    }

    private Data getMaxLevelFromRightNode(TreeNode root, int level)
    {
        if(root == null) return null;

        Data l = getMaxLevel(root.left, level+1);
        Data r = getMaxLevelFromRightNode(root.right, level+1);

        if(l == null && r == null) {
            return null;
        }
        else if(r == null){
            return l;
        }
        else if(l == null){
            return r;
        }
        else{
            if(l.level >= r.level){
                return l;
            }

            return r;
        }

    }


    private class Data{
        public int value;
        public int level;
    }

}
