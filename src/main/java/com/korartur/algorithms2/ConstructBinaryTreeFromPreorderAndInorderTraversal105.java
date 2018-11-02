package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.HashMap;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        if(preorder.length == 1) return root;


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }


        return build(map, 0, preorder.length-1, preorder, 0);
    }

    private TreeNode build(HashMap<Integer, Integer> map, int pl, int pr, int[] preorder, int il) {
        if(pl > pr) return null;
        if(pl == pr) return new TreeNode(preorder[pl]);

        int i = map.get(preorder[pl]);
        int leftLength = i - il;

        TreeNode res = new TreeNode(preorder[pl]);
        res.left= build(map, pl+1, pl + leftLength, preorder, il);
        res.right = build(map, pl + leftLength+1, pr, preorder, i+1);

        return res;
    }


}
