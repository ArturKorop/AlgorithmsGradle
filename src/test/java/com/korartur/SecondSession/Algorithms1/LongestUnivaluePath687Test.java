package com.korartur.SecondSession.Algorithms1;

import com.korartur.utils.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class LongestUnivaluePath687Test {
    @Test
    public void test1() {
        var l = new LongestUnivaluePath687();
        var node = TreeNode.build(5,4,5,1,1,5);
        Assert.assertEquals(2, l.longestUnivaluePath(node));
    }

    @Test
    public void test2() {
        var l = new LongestUnivaluePath687();
        var node = TreeNode.build(1,4,5,4,4,5);
        Assert.assertEquals(2, l.longestUnivaluePath(node));
    }

    @Test
    public void test3() {
        var l = new LongestUnivaluePath687();
        var node = TreeNode.build(1);
        Assert.assertEquals(0, l.longestUnivaluePath(node));
    }
}
