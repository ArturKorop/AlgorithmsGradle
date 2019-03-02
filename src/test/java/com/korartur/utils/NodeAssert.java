package com.korartur.utils;

import org.junit.Assert;

import java.util.ArrayList;

public class NodeAssert {
    public static void assertEquals(ListNode expected, ListNode actual){
        if(ListNode.areEqual(expected, actual)){
            return;
        }

        var message = "Expected: " + expected.toString() + "\n\r" + "Actual:   " + actual.toString();

        throw new AssertionError(message);
    }

    public static void assertEquals(TreeNode expected, TreeNode actual){
        if(TreeNode.areEqual(expected, actual)){
            return;
        }

        var message = "Expected: " + expected.toString() + "\n\r" + "Actual:   " + actual.toString();

        throw new AssertionError(message);
    }

    public static void assertHeight(int expected, TreeNode root) {
        int height = 0;
        if(root == null){
            Assert.assertEquals(expected, 0);
            return;
        }

        var nodes = new ArrayList<TreeNode>();
        nodes.add(root);
        while (nodes.size() > 0){
            height++;
            var temp = new ArrayList<TreeNode>();
            for (TreeNode node : nodes) {
                if(node.left != null){
                    temp.add(node.left);
                }

                if(node.right != null){
                    temp.add(node.right);
                }
            }

            nodes = temp;
        }

        Assert.assertEquals(expected, height);
    }
}
