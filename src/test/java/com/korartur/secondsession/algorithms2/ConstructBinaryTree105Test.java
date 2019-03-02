package com.korartur.secondsession.algorithms2;

import com.korartur.utils.ListNode;
import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTree105Test {
    @Test
    public void test1() {
        var c = new ConstructBinaryTree105();
        var pre = new int[]{3,9,20,15,7};
        var in = new int[]{9,3,15,20,7};
        var res = c.buildTree(pre, in);

        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(3,9,20,null,null,15,7), res));
    }

    @Test
    public void test2() {
        var c = new ConstructBinaryTree105();
        var pre = new int[]{1,2,3};
        var in = new int[]{2,3,1};
        var res = c.buildTree(pre, in);

        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(1,2,null,null,3), res));
    }
}
