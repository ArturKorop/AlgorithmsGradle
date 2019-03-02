package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

public class ConstructBinaryTree105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode build(int[] preorder, int fromPre, int toPre, int[] inorder, int fromIn, int toIn) {
        if(fromPre >= toPre) return null;

        TreeNode root = new TreeNode(preorder[fromPre]);
        if(fromPre == toPre-1){
            return root;
        }


        int inorderIndex = -1;
        for (int i = fromIn; i < toIn; i++) {
            if (inorder[i] == preorder[fromPre]) {
                inorderIndex = i;
                break;
            }
        }

        int leftCount = inorderIndex - fromIn;

        TreeNode left = build(preorder, fromPre+1, fromPre+1+leftCount, inorder, fromIn, fromIn+leftCount);
        TreeNode right = build(preorder, fromPre+1+leftCount, toPre, inorder, inorderIndex+1, toIn);

        root.left = left;
        root.right = right;

        return root;

    }
}

