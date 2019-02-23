package com.korartur.FirstSession.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class RecoverBinarySearchTree99Test {

    @Test
    public void test1() {
        var  r = new RecoverBinarySearchTree99();
        TreeNode root = TreeNode.build(new Integer[]{1,3,null,null,2});
        r.recoverTree(root);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(new Integer[]{3,1,null,null,2}), root));
    }

    @Test
    public void test2() {
        var  r = new RecoverBinarySearchTree99();
        TreeNode root = TreeNode.build(new Integer[]{3, 1, 4, null, null, 2});
        r.recoverTree(root);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(new Integer[]{2,1,4,null,null,3}), root));
    }

    @Test
    public void test3() {
        var  r = new RecoverBinarySearchTree99();
        TreeNode root = TreeNode.build(new Integer[]{5,3,8,9,null,null,2});
        r.recoverTree(root);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(new Integer[]{5,3,8,2,null,null,9}), root));
    }

    @Test
    public void test4() {
        var  r = new RecoverBinarySearchTree99();
        TreeNode root = TreeNode.build(new Integer[]{3,null,2,null,1});
        r.recoverTree(root);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(new Integer[]{1,null,2,null,3}), root));
    }

    @Test
    public void test5() {
        var  r = new RecoverBinarySearchTree99();
        TreeNode root = TreeNode.build(new Integer[]{146,71,-13,55,null,231, 399,321, null,null,null,null,null, -33});
        r.recoverTree(root);
        Assert.assertTrue(TreeNode.areEqual(TreeNode.build(new Integer[]{146,71,321,55,null,231, 399,-13, null,null,null,null,null, -33}), root));
    }
}
