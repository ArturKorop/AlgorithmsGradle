package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        find(root, sum, current, res);

        return res;
    }

    private void find(TreeNode root, int sum, List<Integer> current, List<List<Integer>> result) {
        if (root == null) return;

        current.add(root.val);

        if (root.val == sum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(current));
        } else {
            find(root.left, sum - root.val, current, result);
            find(root.right, sum - root.val, current, result);
        }

        current.remove(current.size()-1);
    }
}
