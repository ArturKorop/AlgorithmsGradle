package com.koratur.utils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TreeNodeBuilder {

    public static TreeNode build(Integer[] input)
    {
        TreeNode root = new TreeNode(input[0]);
        int index = 0;
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while (index < input.length-1)
        {
            List<TreeNode> temp = new ArrayList<>();
            for (int i = 0; i < nodes.size(); i++) {
                TreeNode node = nodes.get(i);
                TreeNode left = null;
                TreeNode right = null;

                if(node != null) {

                    index++;
                    if(input[index] != null) {
                        left = new TreeNode(input[index]);
                    }

                    index++;
                    if(input[index] != null){
                        right = new TreeNode(input[index]);
                    }

                    node.left = left;
                    node.right = right;
                }

                temp.add(left);
                temp.add(right);
            }

            nodes = temp;
        }

        return root;

    }

    public static TreeNode build2(Integer[] input)
    {
        TreeNode root = new TreeNode(input[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        for (int i = 1; i < input.length; i+=2) {
            TreeNode left = input[i] == null ? null : new TreeNode(input[i]);
            TreeNode right  = input[i+1] == null ? null : new TreeNode(input[i+1]);

            TreeNode current = queue.poll();
            current.left = left;
            current.right = right;

            if(left != null){
                queue.add(left);
            }

            if(right != null) {
                queue.add(right);
            }
        }

        return root;
    }

}
