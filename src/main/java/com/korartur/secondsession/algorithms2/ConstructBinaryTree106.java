package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;

public class ConstructBinaryTree106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int fromIn, int toIn, int fromPost, int toPost){
        if(fromPost > toPost || fromPost < 0) return null;
        TreeNode root = new TreeNode(postorder[toPost]);

        if(fromPost == toPost) return root;

        int inIndex = -1;
        for(int i = fromIn; i<=toIn;i++) {
            if(inorder[i] == postorder[toPost]){
                inIndex = i;
                break;
            }
        }

        int leftCount = inIndex - fromIn;
        int rightCount = toIn  - inIndex;

        root.left = build(inorder, postorder, fromIn, fromIn+leftCount-1, fromPost, fromPost+leftCount-1);
        root.right = build(inorder, postorder, inIndex+1, toIn, fromPost+leftCount, toPost-1);

        return root;
    }
}
