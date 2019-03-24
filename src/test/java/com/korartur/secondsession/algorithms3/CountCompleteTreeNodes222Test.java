package com.korartur.secondsession.algorithms3;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class CountCompleteTreeNodes222Test {
    @Test
    public void test1() {
        var c = new CountCompleteTreeNodes222();
        var node = TreeNode.build(1,2,3,4,5,6);
        Assert.assertEquals(6, c.countNodes(node));
    }

    @Test
    public void test2() {
        var c = new CountCompleteTreeNodes222();
        var node = TreeNode.build(1,2,3);
        Assert.assertEquals(3, c.countNodes(node));
    }

    @Test
    public void test3() {
        var c = new CountCompleteTreeNodes222();
        var node = TreeNode.build(1,2,3,4);
        Assert.assertEquals(4, c.countNodes(node));
    }

    @Test
    public void test4() {
        var c = new CountCompleteTreeNodes222();
        var node = TreeNode.build(1,2,3,4,5);
        Assert.assertEquals(5, c.countNodes(node));
    }
}
