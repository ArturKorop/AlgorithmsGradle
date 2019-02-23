package com.korartur.FirstSession.algorithms3;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Codec297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return null;

        StringBuilder sb = new StringBuilder();

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        boolean anyValueNodes = true;
        while (nodes.size() > 0){
            if(!anyValueNodes) break;
            anyValueNodes = false;

            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode node : nodes) {
                if(node == null) {
                    sb.append("n,");
                    continue;
                }
                sb.append(node.val + ",");
                temp.add(node.left);
                temp.add(node.right);

                if(node.left != null || node.right != null) {
                    anyValueNodes = true;
                }

            }

            nodes = temp;
        }

        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null) return null;

        String[] strValues = data.split(",");
        Integer[] values = new Integer[strValues.length];

        for (int i = 0; i < strValues.length; i++) {
            if(strValues[i].equals("n")){
                values[i] = null;
            } else {
                values[i] = Integer.parseInt(strValues[i]);
            }
        }


        TreeNode root = new TreeNode(values[0]);

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        int index = 1;

        while (nodes.size() > 0 && index < values.length){
            List<TreeNode> temp = new ArrayList<>();

            for (TreeNode node : nodes) {
                if(index >= values.length) break;

                if(values[index] != null){
                    TreeNode newNode = new TreeNode(values[index]);
                    node.left = newNode;
                    temp.add(newNode);
                }

                index++;
                if(index >= values.length) break;

                if(values[index] != null){
                    TreeNode newNode = new TreeNode(values[index]);
                    node.right = newNode;
                    temp.add(newNode);
                }

                index++;
            }

            nodes = temp;
        }


        return root;

    }
}
