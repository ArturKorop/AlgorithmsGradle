package com.korartur.firstsession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal106Test {
    @Test
    public void test1() {
        var c = new ConstructBinaryTreeFromInorderAndPostorderTraversal106();
        var res = c.buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});

        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(3,9,20,null,null,15,7), res));
    }
}
