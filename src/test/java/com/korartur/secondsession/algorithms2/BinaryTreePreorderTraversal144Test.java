package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreePreorderTraversal144Test {
    @Test
    public void test1() {
        var b = new BinaryTreePreorderTraversal144();
        var node = TreeNode.build(1,null,2,3);
        Assert.assertArrayEquals(new int[]{1,2,3}, b.preorderTraversal(node).stream().mapToInt(x->x).toArray());
    }
}
