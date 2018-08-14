package com.koratur.utils;

import java.util.ArrayList;
import java.util.List;

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
}
