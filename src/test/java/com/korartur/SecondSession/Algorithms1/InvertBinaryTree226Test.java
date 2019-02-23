package com.korartur.SecondSession.Algorithms1;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class InvertBinaryTree226Test {
    @Test
    public void test1() {
        var i = new InvertBinaryTree226();
        var root = TreeNode.build(4, 2, 7, 1, 3, 6, 9);
        var res = i.invertTree(root);

        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(4,7,2,9,6,3,1), res));
    }
}
