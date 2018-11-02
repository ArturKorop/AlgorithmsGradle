package com.korartur.algorithms2;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ValidateBinarySearchTree98Test {
    @Test
    public void test1() {
        var v = new ValidateBinarySearchTree98();
        TreeNode n = TreeNode.build(new Integer[]{2,1,3});
        Assert.assertTrue(v.isValidBST(n));
    }

    @Test
    public void test2() {
        var v = new ValidateBinarySearchTree98();
        TreeNode n = TreeNode.build(new Integer[]{5,2,4,null,null,3,6});
        Assert.assertFalse(v.isValidBST(n));
    }

    @Test
    public void test3() {
        var v = new ValidateBinarySearchTree98();
        TreeNode n = TreeNode.build(new Integer[]{10,5,15,null,null, 6,20});
        Assert.assertFalse(v.isValidBST(n));
    }

}
