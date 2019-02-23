package com.korartur.FirstSession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreesII95Test {

    @Test
    public void test1() {
        var u = new UniqueBinarySearchTreesII95();
        Assert.assertEquals(42, u.generateTrees(5).size());
    }
}
