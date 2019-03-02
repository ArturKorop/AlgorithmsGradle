package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTree96Test {
    @Test
    public void test1() {
        var u = new UniqueBinarySearchTree96();
        Assert.assertEquals(5, u.numTrees(3));
        Assert.assertEquals(14, u.numTrees(4));
        Assert.assertEquals(42, u.numTrees(5));
        Assert.assertEquals(132, u.numTrees(6));
    }
}
