package com.korartur.firstsession.algorithms3;

import com.korartur.utils.TreeNode;

public class DeleteNodeInBST450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode[] rootAndParent = findRootAndParent(root, key, null);
        if(rootAndParent == null) return root;

        if(rootAndParent[1] == null){
            return removeRoot(root);
        }

        removeFromParent(rootAndParent[0], rootAndParent[1]);

        return root;
    }

    private void removeFromParent(TreeNode node, TreeNode parent) {
        TreeNode insteadNode = null;
        if(node.left == null && node.right == null){
            insteadNode = null;
        } else if(node.left == null){
            insteadNode = node.right;
        } else if(node.right == null){
            insteadNode = node.left;
        } else {
            TreeNode left = node.left;
            TreeNode right = node.right;
            TreeNode smallestRight = right;

            while (smallestRight.left != null){
                smallestRight = smallestRight.left;
            }

            smallestRight.left = left;
            insteadNode = right;
        }

        if(parent.left == node){
            parent.left = insteadNode;
        } else {
            parent.right = insteadNode;
        }
    }

    private  TreeNode removeRoot(TreeNode root){

        if(root.left == null) return root.right;
        if(root.right == null) return root.left;

        TreeNode left =  root.left;
        TreeNode right = root.right;

        TreeNode smallestRight = right;

        while (smallestRight.left != null){
            smallestRight = smallestRight.left;
        }

        smallestRight.left = left;

        return right;
    }

    private TreeNode[] findRootAndParent(TreeNode node, int key, TreeNode parent){
        if(node == null) return null;
        if(node.val == key) return new TreeNode[]{node, parent};

        if(key < node.val){
            return findRootAndParent(node.left, key, node);
        } else {
            return findRootAndParent(node.right, key, node);
        }
    }
}
