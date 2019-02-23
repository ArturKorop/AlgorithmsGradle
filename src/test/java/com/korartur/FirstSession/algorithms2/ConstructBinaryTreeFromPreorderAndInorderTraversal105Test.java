package com.korartur.FirstSession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105Test {
    @Test
    public void test1() {
        var c = new ConstructBinaryTreeFromPreorderAndInorderTraversal105();
        var res = c.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(3,9,20,null,null,15,7), res));
    }

    @Test
    public void test2() {
        var c = new ConstructBinaryTreeFromPreorderAndInorderTraversal105();
        var res = c.buildTree(new int[]{1,2,4,5,3,6,7}, new int[]{4,2,5,1,6,3,7});
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(1,2,3,4,5,6,7), res));
    }
}
