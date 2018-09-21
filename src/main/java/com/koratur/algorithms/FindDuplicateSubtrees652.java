package com.koratur.algorithms;

import com.koratur.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateSubtrees652 {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        if(root == null || (root.left == null && root.right == null)) return res;

        HashSet<TreeNodeWithHash> r2 = new HashSet<>();
        HashSet<TreeNodeWithHash> set = new HashSet<>();

        compareAndAdd(root, set, r2);

        for (TreeNodeWithHash treeNodeWithHash : r2) {
            res.add(treeNodeWithHash._node);
        }

        return res;
    }

    private void compareAndAdd(TreeNode node, HashSet<TreeNodeWithHash> set, HashSet<TreeNodeWithHash> res)
    {
        if(node == null) return;

        TreeNodeWithHash n = new TreeNodeWithHash(node);
        if(set.contains(n)){
            res.add(n);
        }

        set.add(n);

        compareAndAdd(node.left, set, res);
        compareAndAdd(node.right, set, res);
    }

    private class TreeNodeWithHash{
        private TreeNode _node;
        private int hashCode;

        private TreeNodeWithHash(TreeNode node) {
            this._node = node;
            hashCode = getHashCode(node, 1);
        }

        @Override
        public int hashCode() {
            return hashCode;
        }

        private int getHashCode(TreeNode node, int index){
            if(node == null) return 0;
            int r = node.val + index + getHashCode(node.left, index) + getHashCode(node.right, index);

            return r;
        }

        @Override
        public boolean equals(Object obj) {
            TreeNodeWithHash n = (TreeNodeWithHash) obj;

            if(this.hashCode() != n.hashCode()) return false;

            return isSame(this._node, n._node);
        }

        private boolean isSame(TreeNode l, TreeNode r)
        {
            if(l == null && r == null)return true;
            if(l == null || r == null) return false;
            if(l.val != r.val) return false;

            return isSame(l.left, r.left) && isSame(l.right, r.right);
        }
    }

}
