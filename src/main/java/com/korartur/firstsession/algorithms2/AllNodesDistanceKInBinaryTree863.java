package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AllNodesDistanceKInBinaryTree863 {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {

        ExtendedTreeNode newRoot = new ExtendedTreeNode(root, null);

        List<Integer> res = new ArrayList<>();


        ExtendedTreeNode newTarget = getTarget(newRoot, target.val);

        findDist(newTarget, res, 0,  K, new HashSet<>());


        return res;
    }

    private void findDist(ExtendedTreeNode target, List<Integer> result, int currentDist, int targetDist, HashSet<Integer> visited){
        if(target == null) return;
        if(visited.contains(target.val)) return;
        visited.add(target.val);

        if(currentDist == targetDist){
            result.add(target.val);
            return;
        }

        findDist(target.left, result, currentDist+1, targetDist, visited);
        findDist(target.right, result, currentDist+1, targetDist, visited);
        findDist(target.parent, result, currentDist+1, targetDist, visited);

    }



    private ExtendedTreeNode getTarget(ExtendedTreeNode root, int value){
        if(root == null) return null;
        if(root.val == value) return root;

        ExtendedTreeNode left = getTarget(root.left, value);
        if(left != null) return left;

        return getTarget(root.right, value);
    }

    private class ExtendedTreeNode{
        public int val;
        public ExtendedTreeNode left;
        public ExtendedTreeNode right;
        public ExtendedTreeNode parent;

        public ExtendedTreeNode(TreeNode node, ExtendedTreeNode parent) {
            val = node.val;

            this.parent = parent;

            if(node.left != null) {
                left = new ExtendedTreeNode(node.left, this);
            }

            if(node.right != null) {
                right = new ExtendedTreeNode(node.right, this);
            }
        }
    }


}
