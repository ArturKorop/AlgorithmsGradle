package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.HashMap;

public class SmallestSubtreeWithAllTheDeepestNodes {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        HashMap<TreeNode, int[]> data = new HashMap<>();

        int[] max = fill(root, 0, data);

        TreeNode result = root;
        int minLevel = 0;

        for (TreeNode key : data.keySet()) {
            int[] cur = data.get(key);
            if(cur[1] == max[0] && cur[2] == max[1] && cur[0] > minLevel){
                minLevel = cur[0];
                result = key;
            }
        }

        return result;
    }

    private int[] fill(TreeNode node, int level, HashMap<TreeNode, int[]> data){
        int[] cur = new int[3];
        cur[0] = level;

        if(node.left == null && node.right == null) {
            cur[1] = 1;
            cur[2] = level;

            data.put(node ,cur);
            return new int[]{1, level};
        }

        int[] left = null;
        int[] right = null;

        if(node.left != null) left = fill(node.left, level+1, data);
        if(node.right != null) right = fill(node.right, level+1, data);

        if(left == null){
            cur[1] = right[0];
            cur[2] = right[1];
        } else if(right == null){
            cur[1] = left[0];
            cur[2] = left[1];
        } else {
            if(right[1] == left[1]){
                    cur[1] = right[0] + left[0];
                    cur[2] = right[1];
            } else if(right[1] > left[1]){
                cur[1] = right[0];
                cur[2] = right[1];
            } else {
                cur[1] = left[0];
                cur[2] = left[1];
            }
        }

        data.put(node, cur);

        return new int[]{cur[1], cur[2]};



    }

}
