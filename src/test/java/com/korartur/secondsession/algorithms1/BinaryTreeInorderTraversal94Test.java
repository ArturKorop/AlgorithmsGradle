package com.korartur.secondsession.algorithms1;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeInorderTraversal94Test {
    @Test
    public void test1() {
        var b = new BinaryTreeInorderTraversal94();
        var root = TreeNode.build(1, null, 2, 3);
        var result = b.inorderTraversal(root).stream().mapToInt(x -> x).toArray();

        Assert.assertArrayEquals(new int[]{1, 3, 2}, result);
    }
}
