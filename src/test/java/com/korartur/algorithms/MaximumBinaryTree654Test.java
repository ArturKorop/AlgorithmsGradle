package com.korartur.algorithms;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MaximumBinaryTree654Test {

    @Test
    public void Test1() {
        var t = new MaximumBinaryTree654();

        TreeNode expected = TreeNode.build(new Integer[]{ 6,3,5,null,2,0,null,null,1});

        Assert.assertTrue(TreeNode.areEqual(expected, t.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5})));
    }

}
