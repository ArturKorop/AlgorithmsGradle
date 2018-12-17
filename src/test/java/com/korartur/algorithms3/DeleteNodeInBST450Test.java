package com.korartur.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class DeleteNodeInBST450Test {
    @Test
    public void test1() {
        var d = new DeleteNodeInBST450();
        var root = TreeNode.build(5,3,6,2,4,null,7);

        var res = d.deleteNode(root, 3);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(5,4,6,2,null,null,7), res));
    }

    @Test
    public void test2() {
        var d = new DeleteNodeInBST450();
        var root = TreeNode.build(5,3,6,2,4,null,7);

        var res = d.deleteNode(root, 5);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(6,3,7,2,4), res));
    }

    @Test
    public void test3() {
        var d = new DeleteNodeInBST450();
        var root = TreeNode.build(5,3,6,2,4,null,7);

        var res = d.deleteNode(root, 0);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(5,3,6,2,4,null,7), res));
    }
}
