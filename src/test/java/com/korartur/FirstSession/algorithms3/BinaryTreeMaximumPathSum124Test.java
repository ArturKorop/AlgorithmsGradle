package com.korartur.FirstSession.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeMaximumPathSum124Test {
    @Test
    public void test1() {
        var b = new BinaryTreeMaximumPathSum124();
        var node = TreeNode.build(1,2,3);

        Assert.assertEquals(6, b.maxPathSum(node));
    }

    @Test
    public void test3() {
        var b = new BinaryTreeMaximumPathSum124();
        var node = TreeNode.build(1,2);

        Assert.assertEquals(3, b.maxPathSum(node));
    }

    @Test
    public void test4() {
        var b = new BinaryTreeMaximumPathSum124();
        var node = TreeNode.build(-2,-1);

        Assert.assertEquals(-1, b.maxPathSum(node));
    }

    @Test
    public void test2() {
        var b = new BinaryTreeMaximumPathSum124();
        var node = TreeNode.build(-10,9,20,null,null,15,7);

        Assert.assertEquals(42, b.maxPathSum(node));
    }

    @Test
    public void test5() {
        var b = new BinaryTreeMaximumPathSum124();
        var node = TreeNode.build(1,-2,-3,1,3,-2,null,-1);

        Assert.assertEquals(3, b.maxPathSum(node));
    }

    @Test
    public void test6() {
        var b = new BinaryTreeMaximumPathSum124();
        var node = TreeNode.build(5,4,8,11,null,13,4,7,2,null,null,null,1);

        Assert.assertEquals(48, b.maxPathSum(node));
    }
}
