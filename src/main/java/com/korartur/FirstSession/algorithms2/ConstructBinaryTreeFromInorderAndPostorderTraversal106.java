package com.korartur.FirstSession.algorithms2;

import com.korartur.utils.TreeNode;

import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }

    private TreeNode build(int[] inorder ,int il, int ir
            , int[] postorder, int pl, int pr
            , HashMap<Integer, Integer> map) {

        if (pl > pr) return null;
        if (pl == pr) return new TreeNode(postorder[pl]);

        int currentValue = postorder[pr];

        int index = map.get(currentValue);
        int left = index - il;
        int right = ir - index;

        TreeNode root = new TreeNode(postorder[pr]);
        root.left = build(inorder, il, il + left - 1, postorder, pl, pl + left - 1, map);
        root.right = build(inorder, index+1, index + right, postorder, pl + left, pl + left + right - 1, map);

        return root;

    }
}
