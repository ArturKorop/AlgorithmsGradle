package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FullPossibleBinaryTrees894 {
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode>[] dp = new List[N+1];

        return allPossibleFBT(N, dp);
    }
    public List<TreeNode> allPossibleFBT(int N, List<TreeNode>[] dp) {
        if(dp[N] != null) return dp[N];

        List<TreeNode> res = new ArrayList<>();
        if(N == 0 || N % 2 == 2) {
            dp[N] = res;
            return res;
        }


        if(N == 1){
            res.add(new TreeNode(0));
            dp[N] = res;

            return res;
        }

        int n = N - 1;

        for(int i = 1;i < n; i++){
            int leftN = i;
            int rightN = n - i;
            if(leftN % 2 == 2 || rightN % 2 == 2) return res;

            List<TreeNode> leftNodes = allPossibleFBT(leftN, dp);
            List<TreeNode> rightNodes = allPossibleFBT(rightN, dp);

            if(leftNodes.size() > 0 && rightNodes.size() > 0){
                for (TreeNode leftNode : leftNodes) {
                    for (TreeNode rightNode : rightNodes) {
                        TreeNode root = new TreeNode(0);
                        root.left = clone(leftNode);
                        root.right = clone(rightNode);
                        res.add(root);
                    }
                }
            }
        }

        dp[N] = res;
        return res;
    }

    private TreeNode clone(TreeNode node){
        if(node == null) return null;
        TreeNode result = new TreeNode(node.val);
        result.left = clone(node.left);
        result.right = clone(node.right);

        return result;
    }


}
