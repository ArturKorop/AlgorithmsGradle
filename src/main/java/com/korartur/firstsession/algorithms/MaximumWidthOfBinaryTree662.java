package com.korartur.firstsession.algorithms;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MaximumWidthOfBinaryTree662 {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        List<int[]> lefts = new ArrayList<>();
        List<int[]> rights = new ArrayList<>();

        int max = 1;
        if(root.left != null && root.right != null) {
            max = 2;
        }

        fillLefts(root.left, 1, 0, lefts);
        fillRights(root.right, 1, 0, rights);

        int to = Math.min(lefts.size(), rights.size()) - 1;

        for(int i = 0; i <= to; i++){

            int[] l = lefts.get(i);
            int[] r = rights.get(i);

            if(l[0]>0 && r[0]>0) {
                max = Math.max(max, l[0] + r[0]);
            }
        }

        for(int i = to+1; i < lefts.size();i++){
            int[] l = lefts.get(i);
            max=  Math.max(max, l[0]-l[1] + 1);
        }

        for(int i = to+1; i < rights.size();i++){
            int[] l = rights.get(i);
            max=  Math.max(max, l[0]-l[1] + 1);
        }

        return max;
    }

    private void fillLefts(TreeNode root, int parentShift, int level, List<int[]> lefts){
        if(root == null) return;
        int parentCurShift = (parentShift-1)*2;
        if(lefts.size() <= level){
            lefts.add(new int[2]);
        }

        int max = 0;
        int min = 0;

        if(root.left != null){
            max = parentCurShift + 2;
            fillLefts(root.left, max, level+1, lefts);
        }

        if(root.right != null){
            min = parentCurShift + 1;
            fillLefts(root.right, min, level+1, lefts);
        }

        if(min == 0 && max > 0){
            min = max;
        } else if(max == 0 && min > 0){
            max = min;
        }

        int[] cur = lefts.get(level);
        cur[0] = Math.max(max, cur[0]);
        if(min > 0 ){
            if(cur[1] == 0) cur[1] = min;
            else cur[1] = Math.min(cur[1], min);
        }
    }

    private void fillRights(TreeNode root, int parentShift, int level, List<int[]> rights){
        if(root == null) return;
        int parentCurShift = (parentShift-1)*2;
        if(rights.size() <= level){
            rights.add(new int[2]);
        }

        int max = 0;
        int min = 0;

        if(root.right != null){
            max = parentCurShift + 2;
            fillRights(root.right, max, level+1, rights);
        }

        if(root.left != null){
            min = parentCurShift + 1;
            fillRights(root.left, min, level+1, rights);
        }

        if(min == 0 && max > 0){
            min = max;
        } else if(max == 0 && min > 0){
            max = min;
        }

        int[] cur = rights.get(level);
        cur[0] = Math.max(max, cur[0]);
        if(min > 0 ){
            if(cur[1] == 0) cur[1] = min;
            else cur[1] = Math.min(cur[1], min);
        }

    }




}
