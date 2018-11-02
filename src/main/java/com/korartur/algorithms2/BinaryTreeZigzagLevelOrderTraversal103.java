package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        boolean leftToRight = true;
        boolean leftToRightAdded = false;
        while (nodes.size() > 0){
            List<Integer> cur = new ArrayList<>();

            List<TreeNode> temp = new ArrayList<>();
            if(leftToRight && leftToRightAdded || !leftToRight && !leftToRightAdded){
                for (TreeNode node : nodes) {
                    cur.add(node.val);

                    if(leftToRightAdded){

                        if(node.left != null) temp.add(node.left);
                        if(node.right != null) temp.add(node.right);
                    } else {
                        if(node.right != null) temp.add(node.right);
                        if(node.left != null) temp.add(node.left);
                    }
                }

                leftToRightAdded = !leftToRightAdded;
            } else {
                for(int i = nodes.size() - 1; i >= 0; i--){
                    TreeNode node = nodes.get(i);
                    cur.add(node.val);
                    if(leftToRightAdded){

                        if(node.right != null) temp.add(node.right);
                        if(node.left != null) temp.add(node.left);
                    } else {

                        if(node.left != null) temp.add(node.left);
                        if(node.right != null) temp.add(node.right);
                    }
                }

                leftToRightAdded = !leftToRightAdded;
            }

            leftToRight = !leftToRight;
            res.add(cur);
            nodes = temp;
        }

        return res;
    }
}
