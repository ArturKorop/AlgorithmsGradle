package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class CountOfRangeSum327Test {
    @Test
    public void test1() {
        var c = new CountOfRangeSum327();

        Assert.assertEquals(3, c.countRangeSum(new int[]{-2,5,-1}, -2,2));
    }
}
