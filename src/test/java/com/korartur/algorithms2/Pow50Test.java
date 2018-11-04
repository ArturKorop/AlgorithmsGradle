package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class Pow50Test {
    @Test
    public void test1() {
        var p = new Pow50();
        Assert.assertEquals((double) 1024, p.myPow(2, 10), 0.000001);
    }

    @Test
    public void test2() {
        var p = new Pow50();
        Assert.assertEquals(9.26100, p.myPow(2.10000, 3), 0.000001);
    }

    @Test
    public void test3() {
        var p = new Pow50();
        Assert.assertEquals(0.25, p.myPow(2.0000, -2), 0.000001);
    }

    @Test
    public void test4() {
        var p = new Pow50();
        Assert.assertEquals(0.0, p.myPow(2.0000, Integer.MIN_VALUE), 0.000001);
    }
}
