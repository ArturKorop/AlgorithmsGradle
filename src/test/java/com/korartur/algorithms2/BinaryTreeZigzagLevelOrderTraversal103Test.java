package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeZigzagLevelOrderTraversal103Test {
    @Test
    public void test1() {
        var b = new BinaryTreeZigzagLevelOrderTraversal103();
        TreeNode root = TreeNode.build(1, 1, 2, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 8);

        var res = b.zigzagLevelOrder(root);
        Assert.assertEquals(4, res.size());
        Assert.assertArrayEquals(new Integer[]{2, 1}, res.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4}, res.get(2).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{8, 7, 6, 5, 4, 3, 2, 1}, res.get(3).toArray(new Integer[]{}));
    }
}
