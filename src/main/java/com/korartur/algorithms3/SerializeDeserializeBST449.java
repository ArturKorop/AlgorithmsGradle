package com.korartur.algorithms3;

import com.korartur.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SerializeDeserializeBST449 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";

        StringBuilder sb = new StringBuilder();

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while (nodes.size() > 0){

            List<TreeNode> temp = new ArrayList<>();
            boolean valueAdded = false;

            for (TreeNode node : nodes) {
                if(node != null){
                    sb.append(node.val + ",");
                    temp.add(node.left);
                    temp.add(node.right);
                    if(node.left != null || node.right != null) valueAdded = true;
                } else {
                    sb.append("n,");
                }
            }

            if(valueAdded) {
                nodes = temp;
            } else {
                nodes.clear();
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0) return null;

        String[] st = data.split(",");

        Integer[] d = new Integer[st.length];
        for (int i = 0; i < st.length; i++) {
            d[i] = st[i].equals("n") ? null : Integer.parseInt(st[i]);
        }

        TreeNode root = new TreeNode(d[0]);
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        int index = 1;
        while (nodes.size() > 0 && index < d.length){

            List<TreeNode> temp = new ArrayList<>();

            for (TreeNode node : nodes) {
                if(index < d.length){
                    if(d[index] != null){
                        node.left = new TreeNode(d[index]);
                        temp.add(node.left);
                    }
                }

                index++;

                if(index < d.length){
                    if(d[index] != null){
                        node.right = new TreeNode(d[index]);
                        temp.add(node.right);
                    }
                }

                index++;
            }

            nodes = temp;
        }

        return root;

    }

}
