package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator173 {

        private List<TreeNode> nodes = new ArrayList<>();

        public BSTIterator173(TreeNode root) {
            addNode(root, nodes);
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return nodes.size() > 0;
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            TreeNode current = nodes.get(nodes.size()-1);
            int res = current.val;

            nodes.remove(nodes.size()-1);
            if(current.right != null){
                addNode(current.right, nodes);
            }

            return res;
        }

    private void addNode(TreeNode right, List<TreeNode> nodes) {
            if(right == null) return;
            nodes.add(right);
            addNode(right.left, nodes);
    }
}
