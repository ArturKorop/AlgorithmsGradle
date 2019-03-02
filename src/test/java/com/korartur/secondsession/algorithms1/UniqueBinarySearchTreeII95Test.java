package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreeII95Test {
    @Test
    public void test1() {
        var u = new UniqueBinarySearchTreeII95();

        var res = u.generateTrees(3);
        Assert.assertEquals(5, res.size());

         res = u.generateTrees(4);
        Assert.assertEquals(14, res.size());

         res = u.generateTrees(5);
        Assert.assertEquals(42, res.size());
    }
}
