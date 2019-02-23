package com.korartur.FirstSession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePreorderTraversal144Test {
    @Test
    public void test1() {
        var b =  new BinaryTreePreorderTraversal144();
        TreeNode node = TreeNode.build(1,null,2,3);
        Assert.assertArrayEquals(new Integer[]{1,2,3}, b.preorderTraversal(node).toArray(new Integer[]{}));

    }
}
