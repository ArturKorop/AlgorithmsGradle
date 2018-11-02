package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII95 {
    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }

    private List<TreeNode> generate(int start, int end){

        List<TreeNode> res = new ArrayList<>();
        if(start > end){
            res.add(null);
            return res;
        }

        if(start == end){
            res.add(new TreeNode(start));
            return res;
        }

        List<TreeNode> left, right;
        for(int i = start; i <= end; i++){
            left = generate(start, i-1);
            right = generate(i+1, end);

            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    res.add(root);
                }
            }
        }

        return res;

    }

}
