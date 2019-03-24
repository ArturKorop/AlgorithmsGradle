package com.korartur.secondsession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeMaxPathSum124Test {
    @Test
    public void test1() {
        var b = new BinaryTreeMaxPathSum124();
        var root = TreeNode.build(1,2,3);
        Assert.assertEquals(6, b.maxPathSum(root));
    }

    @Test
    public void test2() {
        var b = new BinaryTreeMaxPathSum124();
        var root = TreeNode.build(-10,9,20,null,null,15,7);
        Assert.assertEquals(42, b.maxPathSum(root));
    }
}
