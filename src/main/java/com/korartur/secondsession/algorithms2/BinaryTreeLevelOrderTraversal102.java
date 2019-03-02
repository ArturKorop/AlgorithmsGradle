package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while (nodes.size() > 0){

            List<TreeNode> temp = new ArrayList<>();
            List<Integer> currentResult = new ArrayList<>();

            for (TreeNode node : nodes) {
                currentResult.add(node.val);
                if(node.left != null){
                    temp.add(node.left);
                }

                if(node.right != null){
                    temp.add(node.right);
                }
            }

            result.add(currentResult);
            nodes = temp;
        }

        return result;
    }
}
