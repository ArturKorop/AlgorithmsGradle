package com.korartur.secondsession.algorithms1;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreeII95 {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<>();


        List<TreeNode>[] dp = new List[n+1];
        List<TreeNode> l1 = new ArrayList<>();

        l1.add(null);
        dp[0] = l1;
        l1 = new ArrayList<>();

        l1.add(new TreeNode(1));

        dp[1] = l1;
        if(n == 1) return l1;

        l1 = new ArrayList<>();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 =new TreeNode(2);
        t1.right = t2;
        l1.add(t1);

        t1 = new TreeNode(1);
        t2 =new TreeNode(2);

        t2.left = t1;
        l1.add(t2);

        dp[2] = l1;
        if(n == 2) return l1;

        for(int i = 3; i<= n; i++){

            int l = 0;
            int r = i - l - 1;

            List<TreeNode> resI = new ArrayList<>();

            for(int t = 1; t <= i; t++){
                List<TreeNode> left = dp[t-1];
                List<TreeNode> right = generate(t+1, i);

                for (TreeNode lNode : left) {
                    for (TreeNode rNode : right) {
                        TreeNode curRes = new TreeNode(t);
                        curRes.left = clone(lNode);
                        curRes.right = clone(rNode);

                        resI.add(curRes);
                    }
                }
            }

            dp[i] = resI;
        }

        return dp[n];
    }

    private List<TreeNode> generate(int from, int to){
        List<TreeNode> result = new ArrayList<>();

        if(from > to){
            result.add(null);
            return result;
        }

        if(from == to)
        {
            result.add(new TreeNode(from));

            return result;
        }

        List<TreeNode> first = generate(from+1, to);
        for (TreeNode tf : first) {
            TreeNode node = new TreeNode(from);
            node.right = tf;
            result.add(node);
        }

        List<TreeNode> last = generate(from, to-1);
        for (TreeNode tf : last) {
            TreeNode node = new TreeNode(to);
            node.left = tf;
            result.add(node);
        }

        for(int i = from+1; i < to; i++){
            TreeNode tf = new TreeNode(i);
            List<TreeNode> left = generate(from, i-1);
            List<TreeNode> right = generate(i+1, to);

            for (TreeNode ln : left) {
                for (TreeNode rn : right) {
                    TreeNode cur = new TreeNode(i);
                    cur.left = ln;
                    cur.right = rn;

                    result.add(cur);
                }
            }

        }

        return result;
    }

    private TreeNode clone(TreeNode node){
        if(node == null) return node;

        TreeNode clone = new TreeNode(node.val);
        clone.left = clone(node.left);
        clone.right = clone(node.right);

        return clone;
    }
}
