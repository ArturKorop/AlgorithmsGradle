package com.korartur.firstsession.algorithms;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MaximumWidthOfBinaryTree662Test {

    @Test
    public void test1(){
        var m = new MaximumWidthOfBinaryTree662();

        Assert.assertEquals(4,
                m.widthOfBinaryTree(TreeNode.build(
                        new Integer[]{1,2,3,4,5,null,6})));
    }

    @Test
    public void test2(){
        var m = new MaximumWidthOfBinaryTree662();

        Assert.assertEquals(8,
                m.widthOfBinaryTree(TreeNode.build(
                        new Integer[]{1,2,3,4,null,null,5,6,null,null,7})));
    }

    @Test
    public void test3(){
        var m = new MaximumWidthOfBinaryTree662();

        Assert.assertEquals(2,
                m.widthOfBinaryTree(TreeNode.build(
                        new Integer[]{1,2,null,4,5})));
    }
}
