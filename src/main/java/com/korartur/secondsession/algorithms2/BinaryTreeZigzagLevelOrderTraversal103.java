package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        boolean order = true;

        while (nodes.size() > 0){
            List<TreeNode> temp = new ArrayList<>();
            LinkedList<Integer> currentResult = new LinkedList<>();

            if(order){
                for (int i = 0; i < nodes.size(); i++) {
                    TreeNode node = nodes.get(i);
                    currentResult.addLast(node.val);
                    if(node.left != null){
                        temp.add(node.left);
                    }

                    if(node.right != null){
                        temp.add(node.right);
                    }
                }
            }
            else{
                for (int i = 0; i < nodes.size(); i++) {
                    TreeNode node = nodes.get(i);
                    currentResult.addFirst(node.val);
                    if(node.left != null){
                        temp.add(node.left);
                    }

                    if(node.right != null){
                        temp.add(node.right);
                    }
                }
            }

            order = !order;
            nodes = temp;
            res.add(currentResult);
        }

        return res;
    }
}
