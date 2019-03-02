package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeZigzagLevelOrderTraversal103Test {
    @Test
    public void test1() {
        var b = new BinaryTreeZigzagLevelOrderTraversal103();
        var root = TreeNode.build(3, 9, 20, null, null, 15, 7);
        var res = b.zigzagLevelOrder(root);

        Assert.assertEquals(3, res.size());
        Assert.assertArrayEquals(new int[]{3}, res.get(0).stream().mapToInt(x->x).toArray());
        Assert.assertArrayEquals(new int[]{20,9}, res.get(1).stream().mapToInt(x->x).toArray());
        Assert.assertArrayEquals(new int[]{15,7}, res.get(2).stream().mapToInt(x->x).toArray());
    }
}
